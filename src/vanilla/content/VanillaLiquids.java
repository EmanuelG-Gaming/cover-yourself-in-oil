package vanilla.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.*;

public class VanillaLiquids implements ContentList{
    public static Liquid trollPhysicsOil;
    
    @override
    public void load(){
        
        trollPhysicsOil = new Liquid("troll-physics-oil", "color.valueOf("dbc75c")){{
            temperature = 0f;
            viscosity = 0.1f;
            explosiveness = 0f;
            effect = StatusEffects.floating;
       }};
    }
}
