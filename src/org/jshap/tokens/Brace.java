package org.jshap.tokens;

/**
 * Скобка
 * @param brace тип скобки
 */
public record Brace (
        BraceType brace
) implements Token {
    public TokenType type() {
        return TokenType.BRACE;
    }
}
