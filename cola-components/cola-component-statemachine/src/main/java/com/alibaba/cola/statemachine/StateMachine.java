package com.alibaba.cola.statemachine;

import java.util.List;

/**
 * StateMachine
 *
 * @author Frank Zhang
 *
 * @param <S> the type of state
 * @param <E> the type of event
 * @param <C> the user defined context
 * @date 2020-02-07 2:13 PM
 */
public interface StateMachine<S, E, C> extends Visitable{

    /**
     * Verify if an event {@code E} can be fired from current state {@code S}
     * @param sourceStateId
     * @param event
     * @return
     */
    boolean verify(S sourceStateId,E event);

    /**
     * Sending an event {@code E} to the state machine
     * Calculate the subsequent states of the current sourceState in advance
     *
     * @param sourceState the source state
     * @param event the event to send
     * @return the target state list
     */
    List<S> getTargetStates(S sourceState, E event);

    /**
     * Sending an event {@code E} to the state machine
     * Calculate the subsequent state chain of the current sourceState in advance
     * This method does not actually perform state transitions
     *
     * @param sourceState   the source state
     * @param event         the event to send
     * @param includeSource Whether the output contains sourceState
     * @return the target state chain list
     */
    List<StateChain<S>> getTargetStateChain(S sourceState, E event, boolean includeSource);

    /**
     * Send an event {@code E} to the state machine.
     *
     * @param sourceState the source state
     * @param event the event to send
     * @param ctx the user defined context
     * @return the target state
     */
     S fireEvent(S sourceState, E event, C ctx);

     List<S> fireParallelEvent(S sourceState, E event, C ctx);

    /**
     * MachineId is the identifier for a State Machine
     * @return
     */
    String getMachineId();

    /**
     * Use visitor pattern to display the structure of the state machine
     */
    void showStateMachine();

    String generatePlantUML();
}
