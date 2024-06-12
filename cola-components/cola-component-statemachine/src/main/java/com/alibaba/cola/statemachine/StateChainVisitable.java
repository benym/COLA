package com.alibaba.cola.statemachine;

/**
 * StateChainVisitable
 *
 * @author benym
 * @date 2024/6/12 18:07
 */
public interface StateChainVisitable {

    String accept(final StateChainVisitor visitor);
}
