package

import java.lang.String;

default

public class Lemmatizer{
    String edit;
    boolean style;
    public Lemmatizer (){
        edit ="";
    }
    public void loadString(String input){
        edit = input;
        style = Ducai.getStyle(input);
    }

    public String getString() {
        return edit;
    }

    public boolean isYlioma() {
        return style;
    }

    public String toLemma(){
        if(edit==null || style==true){
            return null;
        }

        StringBuilder sb = new StringBuilder(input);

        if (Ducai.isVerb(edit)){
            char u =sb.charAt(sb.length()-1);
            char pu = sb.charAt(sb.length()-2);
            char apu = sb.charAt(sb.length()-3);

            if(u.equals('r')){
                return edit
            }
            else if(u.equals('a')) & p.equals('r')){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(u.equals('a')) & p.equals('r')){
                sb.deleteCharAt(sb.length()-1);
                return sb.toString();
            }
            else if(p.equals('j')){
                sb.delete(sb.length()-3;sb.length()-1);
                sb.append(Ducai.getInfStem(edit));
                return sb.toString();
            }
            else if(u.equals('a')) & p.equals('y')){
                sb.delete(sb.length()-3;sb.length()-1);
                sb.append(Ducai.getInfStem(edit));
                return sb.toString();
            }

        }

    }
    public static void main (String args[]){
        Lemmatizer l = new Lemmatizer();
        System.out.println("Lemmatizing word: " + args[0]);
        System.out.println("Lemma: " + l.toLemma(args[0]));
    }
}