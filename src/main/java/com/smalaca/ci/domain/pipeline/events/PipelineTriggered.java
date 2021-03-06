package com.smalaca.ci.domain.pipeline.events;

import com.smalaca.ci.domain.pipeline.PipelineId;

public class PipelineTriggered implements PipelineEvent {
    private final PipelineId pipelineId;

    PipelineTriggered(PipelineId pipelineId) {
        this.pipelineId = pipelineId;
    }

    @Override
    public PipelineId pipelineId() {
        return pipelineId;
    }
}
