package com.google.cloud.verticals.foundations.dataharmonization.doclet.model;

import com.google.common.collect.ImmutableList;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FunctionDoc extends FunctionDoc {

  private final String body;

  private final String name;

  private final ImmutableList<ArgumentDoc> arguments;

  private final ImmutableList<ReturnDoc> thrownExceptions;

  private final ReturnDoc returns;

  private AutoValue_FunctionDoc(
      String body,
      String name,
      ImmutableList<ArgumentDoc> arguments,
      ImmutableList<ReturnDoc> thrownExceptions,
      ReturnDoc returns) {
    this.body = body;
    this.name = name;
    this.arguments = arguments;
    this.thrownExceptions = thrownExceptions;
    this.returns = returns;
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
  public ImmutableList<ArgumentDoc> arguments() {
    return arguments;
  }

  @Override
  public ImmutableList<ReturnDoc> thrownExceptions() {
    return thrownExceptions;
  }

  @Override
  public ReturnDoc returns() {
    return returns;
  }

  @Override
  public String toString() {
    return "FunctionDoc{"
        + "body=" + body + ", "
        + "name=" + name + ", "
        + "arguments=" + arguments + ", "
        + "thrownExceptions=" + thrownExceptions + ", "
        + "returns=" + returns
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FunctionDoc) {
      FunctionDoc that = (FunctionDoc) o;
      return this.body.equals(that.body())
          && this.name.equals(that.name())
          && this.arguments.equals(that.arguments())
          && this.thrownExceptions.equals(that.thrownExceptions())
          && this.returns.equals(that.returns());
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
    h$ ^= arguments.hashCode();
    h$ *= 1000003;
    h$ ^= thrownExceptions.hashCode();
    h$ *= 1000003;
    h$ ^= returns.hashCode();
    return h$;
  }

  static final class Builder extends FunctionDoc.Builder {
    private String body;
    private String name;
    private ImmutableList.Builder<ArgumentDoc> argumentsBuilder$;
    private ImmutableList<ArgumentDoc> arguments;
    private ImmutableList.Builder<ReturnDoc> thrownExceptionsBuilder$;
    private ImmutableList<ReturnDoc> thrownExceptions;
    private ReturnDoc returns;
    Builder() {
    }
    @Override
    public FunctionDoc.Builder setBody(String body) {
      if (body == null) {
        throw new NullPointerException("Null body");
      }
      this.body = body;
      return this;
    }
    @Override
    public FunctionDoc.Builder setName(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    protected ImmutableList.Builder<ArgumentDoc> argumentsBuilder() {
      if (argumentsBuilder$ == null) {
        argumentsBuilder$ = ImmutableList.builder();
      }
      return argumentsBuilder$;
    }
    @Override
    protected ImmutableList.Builder<ReturnDoc> thrownExceptionsBuilder() {
      if (thrownExceptionsBuilder$ == null) {
        thrownExceptionsBuilder$ = ImmutableList.builder();
      }
      return thrownExceptionsBuilder$;
    }
    @Override
    public FunctionDoc.Builder setReturns(ReturnDoc returns) {
      if (returns == null) {
        throw new NullPointerException("Null returns");
      }
      this.returns = returns;
      return this;
    }
    @Override
    public FunctionDoc build() {
      if (argumentsBuilder$ != null) {
        this.arguments = argumentsBuilder$.build();
      } else if (this.arguments == null) {
        this.arguments = ImmutableList.of();
      }
      if (thrownExceptionsBuilder$ != null) {
        this.thrownExceptions = thrownExceptionsBuilder$.build();
      } else if (this.thrownExceptions == null) {
        this.thrownExceptions = ImmutableList.of();
      }
      String missing = "";
      if (this.body == null) {
        missing += " body";
      }
      if (this.name == null) {
        missing += " name";
      }
      if (this.returns == null) {
        missing += " returns";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_FunctionDoc(
          this.body,
          this.name,
          this.arguments,
          this.thrownExceptions,
          this.returns);
    }
  }

}
