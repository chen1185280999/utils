package com.xym.hadoop.asyncdispatcher;

import org.apache.hadoop.yarn.state.SingleArcTransition;

public class SetupCompletedTransition implements
		SingleArcTransition<JobStateMachine, JobEvent> {

	@Override
	public void transition(JobStateMachine operand, JobEvent event) {
		// TODO Auto-generated method stub

	}

}
