import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Rengar extends Champion {

private Champion adversario;
private String build;
private String combo;
private Item item1;
private Item item2;
private Item item3;
private Item item4;
private Item item5;
List<Item> itens;
public Rengar(String itens[]){
	this.itens=new ArrayList<Item>();

	 dano=68;
	 vida=575.6 ;
	 armor=35;
	 vel_ataque=0.069;
	 movespeed=345;
 	 mr=32;	
	 regen_vida =8.5;
 	 
}
public Rengar(){
	 dano=68;
	 vida=575.6 ;
	 armor=35/(100+35);
	 vel_ataque=0.069;
	 movespeed=345;
	 mr=32;	
	 regen_vida =8.5;
}
public void setAdversario(Champion c) {
this.adversario=c;
}
public void setCombo(String teclas){
this.combo=teclas;
}
public void Q(){

}
public void W(){

}
public void E(){

}
public void R(){

}
public void setLevel(int level){
	
		if(level>1&&level<=18){
	for (int i = 1; i <= level; i++) {
     dano+=3.0;
     vida+=85;
     armor+=3.8;
     vel=(vel*0.03)+vel;
     mr+=1.25;
	 regen+=0.8;
	 System.out.println("Valor de i "+i);
	}
	}
	}

 public void addItem(Item i){
 if (itens.size()<5){
 itens.add(i);
 }
 }
public void removeItem(int i){
--i;
if(i<5){
itens.remove(i);
}else JOptionPane.showMessageDialog(null, "São 5 itens animal");
}
public void ataqueBasico(){
if(pen_armor>0)adversario.armor=adversario.armor-(adversario.armor*pen_armor);
if(letalidade>0)adversario.armor=adversario.armor-(letalidade);
double danoabsorvido=adversario.armor/(100.0+adversario.armor);     

adversario.vida=dano*danoabsorvido;

}
public void build(){
for (int i = 0; i < itens.size(); i++) {
	 pdh+=itens.get(i).pdh;
	 dano+=itens.get(i).dano;
	 roubo+=itens.get(i).roubo;
	 vida+=itens.get(i).vida;
	 mr+=itens.get(i).mr;
	 rt+=itens.get(i).rt;
	 armor+=itens.get(i).armor;
	 movespeed+=itens.get(i).movespeed;
	 vel_ataque+=itens.get(i).vel_ataque;
	 critico+=itens.get(i).critico;
	 pen_armor+=itens.get(i).pen_armor;
	 pen_magic+=itens.get(i).pen_magic;
	 vampirismo+=itens.get(i).vampirismo;
	 letalidade+=itens.get(i).letalidade;
	 regen_vida+=itens.get(i).regen_vida;
	 tenacidade+=itens.get(i).tenacidade;
	 mana+=itens.get(i).mana;
}
}
public String buildFullDamage(){
	
 	return build;
}
public String buidlFullTank(){
	return build;
}
public String AdTank(){
	return build;
}
public String AdVel(){
	return build;
}
public String AdTenacidade() {
	return build;
}

public void getInfo(){
	System.out.println("Dano: "+dano);
	System.out.println("Vida: "+vida);
	System.out.println("Armadura: "+armor);
	System.out.println("Velocidade de ataque: "+vel);
	System.out.println("Resistencia magica:"+ mr);
	System.out.println("Regeneração de vida: "+regen);

}
}
