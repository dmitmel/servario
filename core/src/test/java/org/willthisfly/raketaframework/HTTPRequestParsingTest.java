package org.willthisfly.raketaframework;

import org.junit.Test;
import org.willthisfly.raketaframework.util.SyntaxException;

import static org.junit.Assert.assertEquals;

public class HTTPRequestParsingTest {
    @Test
    public void testNothing() {
        String expected = "GET / HTTP/1.1\r\n" +
                "\r\n";
        doTest(expected);
    }

    @Test
    public void testHeadersAndBody() {
        String expected = "GET / HTTP/1.1\r\n" +
                "A: B\r\n" +
                "C: D\r\n" +
                "\r\n" +
                "Some text.\r\n";
        doTest(expected);
    }

    @Test
    public void testHeaders() {
        String expected = "GET / HTTP/1.1\r\n" +
                "A: B\r\n" +
                "C: D\r\n" +
                "\r\n";
        doTest(expected);
    }

    @Test
    public void testBody() {
        String expected = "GET / HTTP/1.1\r\n" +
                "\r\n" +
                "Some text.\r\n";
        doTest(expected);
    }
    
    @Test(expected = SyntaxException.class)
    public void testNoMethod() {
        HTTPRequest.fromString("");
    }
    
    @Test(expected = SyntaxException.class)
    public void testNoURI() {
        HTTPRequest.fromString("GET");
    }
    
    @Test(expected = SyntaxException.class)
    public void testNoProtocol() {
        HTTPRequest.fromString("GET /");
    }

    private void doTest(String expected) {
        HTTPRequest actual = HTTPRequest.fromString(expected);
        assertEquals(expected, actual.toString());
        assertEquals(expected.length(), actual.length());
    }
}
