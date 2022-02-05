package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Integer> ids= new ArrayList<Integer>();
    private RegisterResult estate = RegisterResult.VALID;
    public RegisterResult registerVoter(Person p) {
        if (p.isAlive() != true){
            estate = RegisterResult.DEAD;
        }
        else{

             if (ids.contains(p.getId())){
                 estate = RegisterResult.DUPLICATED;
             }
             else if (p.getAge() > 0 && p.getAge() < 18){
                    estate = RegisterResult.UNDERAGE;
                }
             else if (p.getAge() > 120 || p.getAge() < 0) {
                    estate = RegisterResult.INVALID_AGE;
                }
            else{
                 ids.add(p.getId());
             }

        }
        return estate;
    }
}