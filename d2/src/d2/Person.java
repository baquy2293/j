/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

import java.util.Date;

/**
 *
 * @author abc
 */
public class Person {

    private String ht;
    private Date ns;
    private String dc;
    private String gt;

    public Person() {
    }

    public Person(String ht, Date ns, String dc, String gt) {
        this.ht = ht;
        this.ns = ns;
        this.dc = dc;
        this.gt = gt;
    }

    public String getHt() {
        return ht;
    }

    public Date getNs() {
        return ns;
    }

    public String getDc() {
        return dc;
    }

    public String getGt() {
        return gt;
    }

    @Override
    public String toString() {
        return ht + "$" + ns + "$" + dc + "$" + gt + '$';
    }

}
