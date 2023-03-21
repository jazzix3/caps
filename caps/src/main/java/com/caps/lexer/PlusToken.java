package com.caps.lexer;

public class PlusToken implements Token{
    @Override
    public boolean equals(final Object other){
        return other instanceof PlusToken;
    }
    @Override
    public int hashCode(){
        return 5;
    }

    @Override
    public String toString() {
        return "PlusToken{}";
    }
}
