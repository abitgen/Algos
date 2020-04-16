package io.github.abitgen.leetcode.challenge30.twenty20April._16_validParenthesisString



import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import kotlin.math.min

class TestValidParenthesisString {
    var validParenthesisString:ValidParenthesisString? = null

    @Before
    fun init(){
        validParenthesisString = ValidParenthesisString
    }

    @Test
    fun `Positive (*))`(){
        assertTrue(validParenthesisString?.checkValidString("(*))")!!)
    }

    @Test
    fun `Positive (*)`(){
        assertTrue(validParenthesisString?.checkValidString("(*)")!!)
    }

    @Test
    fun `Positive *)`(){
        assertTrue(validParenthesisString?.checkValidString("*)")!!)
    }

    @Test
    fun `Positive ((*(()()))`(){
        assertTrue(validParenthesisString?.checkValidString("((*(()())))")!!)
    }

    @Test
    fun `Positive ((()()))`(){
        assertTrue(validParenthesisString?.checkValidString("((()()))")!!)
    }

    @Test
    fun `Positive ((*)****)`(){
        assertTrue(validParenthesisString?.checkValidString("((*)****)")!!)
    }

    @Test
    fun `Positive (*)**((**))((**)`(){
        assertTrue(validParenthesisString?.checkValidString("(*)**((**))((**)")!!)
    }

    @Test
    fun `Positive (*)**((*()*)`(){
        assertTrue(validParenthesisString?.checkValidString("(*)**((*()*)")!!)
    }

    @Test
    fun `Positive (*()(())())())`(){
        assertTrue(validParenthesisString?.checkValidString("(*()(())())())")!!)
    }

    @Test
    fun `Positive ((()))()(())(*()()())**(())()()()()((*()*))((*()*)`(){
        assertTrue(validParenthesisString?.checkValidString("((()))()(())(*()()())**(())()()()()((*()*))((*()*)")!!)
    }

    @Test
    fun `Negative *))`(){
        assertFalse(validParenthesisString?.checkValidString("*))")!!)
    }

    @Test
    fun `Negative ((*`(){
        assertFalse(validParenthesisString?.checkValidString("((*")!!)
    }

    @Test
    fun `Negative ((())()))`(){
        assertFalse(validParenthesisString?.checkValidString("((())()))")!!)
    }

    @Test
    fun `Negative ())*(**(()))`(){
        assertFalse(validParenthesisString?.checkValidString("())*(**(()))")!!)
    }

    @Test
    fun `Negative (*)(*)(((*)))((((((*))`(){
        assertFalse(validParenthesisString?.checkValidString("(*)(*)(((*)))((((((*))")!!)
    }

    @Test
    fun `Negative (())((())()()(*)(*()(())())())()()((()())((()))(*`(){
        assertFalse(validParenthesisString?.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*")!!)
    }

    @Test
    fun `Negative (*(()))((())())*(**(()))((*)()(()))*(())()(())(()`(){
        assertFalse(validParenthesisString?.checkValidString("(*(()))((())())*(**(()))((*)()(()))*(())()(())(()")!!)
    }

    @Test
    fun `Negative (((((*(((((*((**(((*)*((((**))*)*)))))))))((*(((((**(**)`(){
        assertFalse(validParenthesisString?.checkValidString("(((((*(((((*((**(((*)*((((**))*)*)))))))))((*(((((**(**)")!!)
    }

}