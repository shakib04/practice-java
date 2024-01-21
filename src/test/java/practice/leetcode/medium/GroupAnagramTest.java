package practice.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    void calculateCharacterPresence() {
        String calculateCharacterPresence = GroupAnagram.calculateCharacterPresence("keen");
        assertEquals("k1e2n1", calculateCharacterPresence);
    }
}