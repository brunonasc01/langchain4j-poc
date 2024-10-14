package com.brnasc.langchain4j.poc.api.usecase;

import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface Assistant {
    String execute(String message);
}
