package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beutify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
