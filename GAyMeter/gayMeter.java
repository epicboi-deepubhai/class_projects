package class_projects.GAyMeter;
import java.util.*;
import java.awt.*;
import java.io.IOException;

public class gayMeter {
    public static void header() throws InterruptedException{
        System.out.println("\t\t\t\t\t█░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀ ░░ ▀█▀ █▀█ ░░ █▀▀ ▄▀█ █▄█ █▀▄▀█ █▀▀ ▀█▀ █▀▀ █▀█TM\n\t\t\t\t\t▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄ ░░ ░█░ █▄█ ░░ █▄█ █▀█ ░█░ █░▀░█ ██▄ ░█░ ██▄ █▀▄");
        String s = "\n\t\t\t      Created by 3 (very straight) individuals to SNIFF out this DISEASE and eradicate your existence.\n\t\t\t\t\t     Join us in this revolution by proving to us that you're not infected.\n\n";
        for (int j = 0; j < s.length(); j++) {
            Thread.sleep(35);
            System.out.print(s.charAt(j));
        }

    }

    public static void gaymeter() throws InterruptedException, AWTException{
        Robot boobs = new Robot();
        Scanner i = new Scanner(System.in);
        String name;
        try{
            Thread.sleep(500, 0);
            System.out.print("Name: ");
            if(i.hasNextInt()){
                i.close();
                throw new InputMismatchException("BRuh u gay asf and dumb meter also skyrocketed. \nYou had to enter a string rock head.");
            }
            name = i.nextLine();
            i.close();
        }catch( InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println(99);
            return;}
        System.out.print("your gayness is about");
        for (int j = 0; j < 3; j++) {
            Thread.sleep(500);
            System.out.print(".");
        }System.out.println();
        Random r = new Random();
        if(name.toLowerCase().contains("i")&& !name.toLowerCase().startsWith("nish", 0)){
            System.out.println((int) Math.floor(Math.random() *(4) + 96));
            String culledText = "YOU MUST BE CULLED!!";
            for (char c : culledText.toCharArray()) {
                if(c==' '){
                    Thread.sleep(500);
                }
                System.out.print(c);
            }
            String url_open ="https://www.youtube.com/watch?v=qDQnFYo8eug";
            try {
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
                Thread.sleep(4000);
                boobs.keyPress(70);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }else{
            System.out.println(r.nextInt(10));
            return ;
        }
        
    }

    public static void main(String[] args){
        try {
            header();
            gaymeter();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
