package org.willthisfly.raketaframework.errors;

public class Error405 extends HTTPError {
    public Error405() {
        super();
    }

    @Override
    public int getCode() {
        return 405;
    }

    @Override
    public String getDescription() {
        return "Method Not Allowed";
    }
}
