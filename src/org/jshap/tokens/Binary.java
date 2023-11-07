package org.jshap.tokens;

/**
 * Бинарная операция
 * @param operation тип бинарной операции
 */
public record Binary (
        BinaryType operation
) implements Token {
    @Override
    public TokenType type() {
        return TokenType.BINARY_OPERATION;
    }
}
