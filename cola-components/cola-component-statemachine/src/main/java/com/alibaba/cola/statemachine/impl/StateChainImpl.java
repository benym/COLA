package com.alibaba.cola.statemachine.impl;

import com.alibaba.cola.statemachine.StateChain;

import java.util.List;

/**
 * StateChainImpl
 *
 * @author benym
 * @date 2024/6/12 0:04
 */
public class StateChainImpl<S> implements StateChain<S> {

    @Override
    public List<S> getStateChain() {
        return List.of();
    }

    @Override
    public String showStateChain() {
        return "";
    }
}
