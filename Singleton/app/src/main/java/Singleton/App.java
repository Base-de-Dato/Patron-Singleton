/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Singleton;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    
    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        Singleton s1 = Singleton.getInstance();
        s1.start();
        
        
    }
}
