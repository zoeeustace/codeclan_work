import Main.Enemies.Troll;
import Main.Objects.Axe;
import Main.Objects.Club;
import Main.Objects.Mace;
import Main.Objects.Sword;
import Main.Player;
import Main.Enemies.Orc;
import Main.Players.Barbarian;
import Main.Players.Dwarf;
import Main.Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Player character;
    Barbarian barbarian;
    Orc orc;
    Club club;
    Dwarf dwarf;
    Axe axe;
    Mace mace;
    Sword sword;
    Troll troll;
    Knight knight;


    @Before
    public void before(){
        club = new Club();
        axe = new Axe();
        mace = new Mace();
        sword = new Sword();
        barbarian = new Barbarian("Conan", 100, club);
        dwarf = new Dwarf("Gimli",100, axe);
        orc = new Orc("Growly", 100, mace);
        troll = new Troll("Grawp", 100, club);
        knight = new Knight("Lance", 100, sword);

    }

    @Test
    public void barbarianAttacksOrc(){
        barbarian.attack(orc);
        assertEquals(95, orc.getHealth());
    }

    @Test public void dwarfAttacksOrc(){
        dwarf.attack(orc);
        assertEquals(85, orc.getHealth());
    }

    @Test public void orcAttacksDwarf(){
        orc.attack(dwarf);
        assertEquals(80, dwarf.getHealth());
    }

    @Test public void knightAttacksTroll(){
        knight.attack(troll);
        assertEquals(90, troll.getHealth());
    }

    @Test public void trollAttacksDwarf(){
        troll.attack(dwarf);
        assertEquals(95, dwarf.getHealth());
    }

}
