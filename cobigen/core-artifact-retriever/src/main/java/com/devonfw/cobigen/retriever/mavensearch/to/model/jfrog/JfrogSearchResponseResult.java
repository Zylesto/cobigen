package com.devonfw.cobigen.retriever.mavensearch.to.model.jfrog;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Jfrog search response result model
 */
class JfrogSearchResponseResult {

  /** uri */
  @JsonProperty("uri")
  private String uri;

  /**
   * @return uri
   */
  @JsonIgnore
  public String getUri() {

    return this.uri;
  }

}
