package com.github.parkee.messenger.model.request.quickreply

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.parkee.messenger.builder.message.quickreply.ContentType

/**
 * Created by parkee on 7/20/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class QuickReply(
        @JsonProperty("content_type", required = true) val contentType: ContentType,
        @JsonProperty("title", required = true) val title: String,
        @JsonProperty("payload", required = true) val payload: Any
)