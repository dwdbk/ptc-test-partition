/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package partition;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import com.partition.PartitionLibrary;
import org.junit.rules.ExpectedException;

public class PartitionLibraryTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    private static final List<Integer> INITLIST = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

   @Test
    public void given_list_when_paritioning_into_n_sublists_then_correct() {
        List<List<Integer>> subSets = PartitionLibrary.partition(INITLIST, 3);
        List<Integer> lastPartition = subSets.get(2);
        List<Integer> expectedLastPartition = new ArrayList<>(Arrays.asList(7, 8));
        assertEquals(subSets.size(), 3);
        assertEquals(lastPartition, expectedLastPartition);
    }

    @Test
    public void given_null_list_when_paritioning_into_n_sublists_then_error() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Given list can't be null");
        PartitionLibrary.partition(null, 3);
    }

    @Test
    public void given_list_and_zero_size_when_paritioning_into_n_sublists_then_error() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Given size can't be negative or zero");
        PartitionLibrary.partition(INITLIST, 0);
    }

    @Test
    public void given_list_and_negative_size_when_paritioning_into_n_sublists_then_error() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Given size can't be negative or zero");
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        PartitionLibrary.partition(intList, -3);
    }
}
