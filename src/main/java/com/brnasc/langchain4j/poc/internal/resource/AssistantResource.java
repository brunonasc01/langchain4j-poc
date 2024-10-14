package com.brnasc.langchain4j.poc.internal.resource;

import com.brnasc.langchain4j.poc.api.usecase.Assistant;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/assist")
public class AssistantResource {

    @Inject
    Assistant assistant;

    @GET
    @Path("/ask")
    @Produces(MediaType.TEXT_PLAIN)
    public String answerQuestion(@QueryParam("question") String question) {
        return this.assistant.execute(question);
    }
}
