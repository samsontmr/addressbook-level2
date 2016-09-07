package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    
    Name name;
    
    @Before
    public void setUp() throws Exception {
        name = new Name("name n");
    }

    @Test
    public final void test_isSimilar_sameString() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("name n")));
    }
    
    @Test
    public final void test_isSimilar_sameStringDifferentCase() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("name N")));
    }

    @Test
    public final void test_isSimilar_differentString() throws IllegalValueException {
        assertFalse(name.isSimilar(new Name("nam na")));
    }
    
    @Test
    public final void test_isSimilar_null() throws IllegalValueException {
        assertFalse(name.isSimilar(null));
    }
    
    @Test
    public final void test_isSimilar_sameNameDifferentOrder() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("n name")));
    }
    
    @Test
    public final void test_isSimilar_superSet() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("name")));
    }
    
    @Test
    public final void test_isSimilar_subSet() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("name n ame")));
    }
}
