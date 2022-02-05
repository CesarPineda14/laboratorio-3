package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();










    @Test
    public void validateAlive() {

        Person person = new Person("jonathan", 2155084, 18, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateAlive2() {

        Person person = new Person("jonathan", 2155084, 18, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateUnderage() {

        Person person = new Person("jonathan", 2155084, 17, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateUnderage2() {

        Person person = new Person("jonathan", 2155084, 18, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateInvalidAge() {

        Person person = new Person("jonathan", 2155084, -1, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateInvalidAge2() {

        Person person = new Person("jonathan", 2155084, 119, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateInvalidAge3() {

        Person person = new Person("jonathan", 2155084, 121, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateDuplicate() {

        Person person = new Person("jonathan", 2155084, 18, Gender.MALE, true);
        Person person2 = new Person("camilo", 2155084, 18, Gender.MALE, true);
        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
    @Test
    public void validateDuplicate2() {

        Person person = new Person("jonathan", 2155084, 18, Gender.MALE, true);
        Person person2 = new Person("camilo", 2155083, 18, Gender.MALE, true);
        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateVote(){

        Person person = new Person("jonathan", 2155084, 18, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

}