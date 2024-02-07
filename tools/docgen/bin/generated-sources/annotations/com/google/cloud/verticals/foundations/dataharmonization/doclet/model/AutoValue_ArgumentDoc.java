package com.google.cloud.verticals.foundations.dataharmonization.doclet.model;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ArgumentDoc extends ArgumentDoc {

  private final String body;

  private final String name;

  private final String type;

  private AutoValue_ArgumentDoc(
      String body,
      String name,
      String type) {
    this.body = body;
    this.name = name;
    this.type = type;
  }

  @Override
  public String body() {
    return body;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String type() {
    return type;
  }

  @Override
  public String toString() {
    return "ArgumentDoc{"
        + "body=" + body + ", "
        + "name=" + name + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ArgumentDoc) {
      ArgumentDoc that = (ArgumentDoc) o;
      return this.body.equals(that.body())
          && this.name.equals(that.name())
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
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    return h$;
  }

  static final class Builder extends ArgumentDoc.Builder {
    private String body;
    private String name;
    private String type;
    Builder() {
    }
    @Override
    public ArgumentDoc.Builder setBody(String body) {
      if (body == null) {
        throw new NullPointerException("Null body");
      }
      this.body = body;
      return this;
    }
    @Override
    public ArgumentDoc.Builder setName(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public ArgumentDoc.Builder setType(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public ArgumentDoc build() {
      String missing = "";
      if (this.body == null) {
        missing += " body";
      }
      if (this.name == null) {
        missing += " name";
      }
      if (this.type == null) {
        missing += " type";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ArgumentDoc(
          this.body,
          this.name,
          this.type);
    }
  }

}
