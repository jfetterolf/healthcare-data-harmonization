package com.google.cloud.verticals.foundations.dataharmonization.doclet.model;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ReturnDoc extends ReturnDoc {

  private final String body;

  private final String type;

  private AutoValue_ReturnDoc(
      String body,
      String type) {
    this.body = body;
    this.type = type;
  }

  @Override
  public String body() {
    return body;
  }

  @Override
  public String type() {
    return type;
  }

  @Override
  public String toString() {
    return "ReturnDoc{"
        + "body=" + body + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ReturnDoc) {
      ReturnDoc that = (ReturnDoc) o;
      return this.body.equals(that.body())
          && this.type.equals(that.type());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= body.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    return h$;
  }

  static final class Builder extends ReturnDoc.Builder {
    private String body;
    private String type;
    Builder() {
    }
    @Override
    public ReturnDoc.Builder setBody(String body) {
      if (body == null) {
        throw new NullPointerException("Null body");
      }
      this.body = body;
      return this;
    }
    @Override
    public ReturnDoc.Builder setType(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public ReturnDoc build() {
      String missing = "";
      if (this.body == null) {
        missing += " body";
      }
      if (this.type == null) {
        missing += " type";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ReturnDoc(
          this.body,
          this.type);
    }
  }

}
