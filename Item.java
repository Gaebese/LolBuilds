import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebClientOptions;
import com.gargoylesoftware.htmlunit.html.HtmlListItem;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class Item  {
private String name;
private String passive="";
public Item(String name){
this.name=name;
}

int pdh=0;
int dano=0;
double roubo=0.0;
int vida=0;
int mr=0;
int rt=0;
int armor=0;
int movespeed=0;
int vel_ataque=0;
double critico=0.0;
int pen_armor=0;
int pen_magic=0;
int vampirismo=0;
int letalidade=0;
int regen_vida=0;
int tenacidade=0;
int mana=0;
}
