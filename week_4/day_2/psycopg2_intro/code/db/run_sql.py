import psycopg2  
import psycopg2.extras as ext

def run_sql(sql, values = None):
    conn = None
    results = []
    
    try:
        conn=psycopg2.connect("dbname='task_manager'")
        cur = conn.cursor(cursor_factory=ext.DictCursor)   
        cur.execute(sql, values)
        conn.commit()
        results = cur.fetchall()
        cur.close()           
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if conn is not None:
            conn.close()
    return results

# make sure to change name of dbname on line 9 to database name as relevant. l9 is running the sql for us
#line 10 - DictCursor ensures that the returned values are readable as otherwise would just return tuples which can only be axxessed by index, and if anything changed then data wouldn't be reachable
#line 12 commit function is vital as tells python that process complete, otherwise won't be able to return results
#line 14 need to close in order to allow other connections to be made when trying to run other methods - keeps db open otherwise and not accessible 
#line 19 similar to above, closes conn for other connections to be able to be made