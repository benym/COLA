package com.alibaba.cola.statemachine;

import java.util.List;

/**
 * StateChain
 *
 * @author benym
 * @date 2024/6/11 23:15
 */
public interface StateChain<S> {

    List<S> getStateChain();

    void showStateChain();

    String generatePlantUml();
}
