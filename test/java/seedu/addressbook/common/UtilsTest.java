package seedu.addressbook.common;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

    private Utils utils;
    
    @Before
    public void setUp() throws Exception {
        utils = new Utils();
    }
    
    /*
     * Tests for single object
     */
    
    @Test
    public final void test_isAnyNull_singleNullObject() {
        Object object = null;
        assertTrue(Utils.isAnyNull(object));
    }

    @Test
    public final void test_isAnyNull_singleObject() {
        Object object = new Object();
        assertFalse(Utils.isAnyNull(object));
    }
    
    @Test
    public final void test_elementsAreUnique_singleObject() {
        List<Object> objectInAList = Arrays.asList(new Object());
        assertTrue(Utils.elementsAreUnique(objectInAList));
    }
    
    /*
     * Tests for multiple objects
     */
    
    public final void test_isAnyNull_multipleObjectsWithSingleNullObject() {
        assertTrue(Utils.isAnyNull(new Object(), new Object(), null));
    }

    public final void test_isAnyNull_arrayofObjects() {
        assertFalse(Utils.isAnyNull(new Object(), new Object(), new Object()));
    }
    
    @Test
    public final void test_elementsAreUnique_ListOfUniqueObjects() {
        List<Object> objects = Arrays.asList(new Object(), new Object(), new Object());
        assertTrue(Utils.elementsAreUnique(objects));
    }

    @Test
    public final void test_elementsAreUnique_ListWithNonUniqueObjects() {
        Object object = new Object();
        List<Object> objects = Arrays.asList(new Object(), object, object);
        assertFalse(Utils.elementsAreUnique(objects));
    }
}
