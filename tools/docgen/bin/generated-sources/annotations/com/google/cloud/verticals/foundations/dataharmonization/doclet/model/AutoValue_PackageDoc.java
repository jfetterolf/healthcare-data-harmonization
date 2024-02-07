package com.google.cloud.verticals.foundations.dataharmonization.doclet.model;

import com.google.common.collect.ImmutableList;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PackageDoc extends PackageDoc {

  private final String packageName;

  private final String className;

  private final ImmutableList<FunctionDoc> functions;

  private final ImmutableList<FunctionDoc> targets;

  private AutoValue_PackageDoc(
      String packageName,
      String className,
      ImmutableList<FunctionDoc> functions,
      ImmutableList<FunctionDoc> targets) {
    this.packageName = packageName;
    this.className = className;
    this.functions = functions;
    this.targets = targets;
  }

  @Override
  public String packageName() {
    return packageName;
  }

  @Override
  public String className() {
    return className;
  }

  @Override
  public ImmutableList<FunctionDoc> functions() {
    return functions;
  }

  @Override
  public ImmutableList<FunctionDoc> targets() {
    return targets;
  }

  @Override
  public String toString() {
    return "PackageDoc{"
        + "packageName=" + packageName + ", "
        + "className=" + className + ", "
        + "functions=" + functions + ", "
        + "targets=" + targets
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PackageDoc) {
      PackageDoc that = (PackageDoc) o;
      return this.packageName.equals(that.packageName())
          && this.className.equals(that.className())
          && this.functions.equals(that.functions())
          && this.targets.equals(that.targets());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= packageName.hashCode();
    h$ *= 1000003;
    h$ ^= className.hashCode();
    h$ *= 1000003;
    h$ ^= functions.hashCode();
    h$ *= 1000003;
    h$ ^= targets.hashCode();
    return h$;
  }

  static final class Builder extends PackageDoc.Builder {
    private String packageName;
    private String className;
    private ImmutableList.Builder<FunctionDoc> functionsBuilder$;
    private ImmutableList<FunctionDoc> functions;
    private ImmutableList.Builder<FunctionDoc> targetsBuilder$;
    private ImmutableList<FunctionDoc> targets;
    Builder() {
    }
    @Override
    public PackageDoc.Builder setPackageName(String packageName) {
      if (packageName == null) {
        throw new NullPointerException("Null packageName");
      }
      this.packageName = packageName;
      return this;
    }
    @Override
    public PackageDoc.Builder setClassName(String className) {
      if (className == null) {
        throw new NullPointerException("Null className");
      }
      this.className = className;
      return this;
    }
    @Override
    protected ImmutableList.Builder<FunctionDoc> functionsBuilder() {
      if (functionsBuilder$ == null) {
        functionsBuilder$ = ImmutableList.builder();
      }
      return functionsBuilder$;
    }
    @Override
    protected ImmutableList.Builder<FunctionDoc> targetsBuilder() {
      if (targetsBuilder$ == null) {
        targetsBuilder$ = ImmutableList.builder();
      }
      return targetsBuilder$;
    }
    @Override
    public PackageDoc build() {
      if (functionsBuilder$ != null) {
        this.functions = functionsBuilder$.build();
      } else if (this.functions == null) {
        this.functions = ImmutableList.of();
      }
      if (targetsBuilder$ != null) {
        this.targets = targetsBuilder$.build();
      } else if (this.targets == null) {
        this.targets = ImmutableList.of();
      }
      String missing = "";
      if (this.packageName == null) {
        missing += " packageName";
      }
      if (this.className == null) {
        missing += " className";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_PackageDoc(
          this.packageName,
          this.className,
          this.functions,
          this.targets);
    }
  }

}
