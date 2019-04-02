package parrentTest;

import org.junit.Test;

/**
 * @author oleksandr.brusov
 * @date 22.06.2018.
 */
public class testfored {
    @Test
    public void test(){
        int myScore=10;
        myScore--;
        myScore=myScore*2;
        myScore=myScore/3;
        System.out.println("My score is " + myScore);
    }
}
