// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/policy_topic_evidence_destination_not_working_device.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Container for enum describing possible policy topic evidence destination not
 * working devices.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum}
 */
public  final class PolicyTopicEvidenceDestinationNotWorkingDeviceEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum)
    PolicyTopicEvidenceDestinationNotWorkingDeviceEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.newBuilder() to construct.
  private PolicyTopicEvidenceDestinationNotWorkingDeviceEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyTopicEvidenceDestinationNotWorkingDeviceEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PolicyTopicEvidenceDestinationNotWorkingDeviceEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceProto.internal_static_google_ads_googleads_v1_enums_PolicyTopicEvidenceDestinationNotWorkingDeviceEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceProto.internal_static_google_ads_googleads_v1_enums_PolicyTopicEvidenceDestinationNotWorkingDeviceEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.class, com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible policy topic evidence destination not working devices.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.PolicyTopicEvidenceDestinationNotWorkingDevice}
   */
  public enum PolicyTopicEvidenceDestinationNotWorkingDevice
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Landing page doesn't work on desktop device.
     * </pre>
     *
     * <code>DESKTOP = 2;</code>
     */
    DESKTOP(2),
    /**
     * <pre>
     * Landing page doesn't work on Android device.
     * </pre>
     *
     * <code>ANDROID = 3;</code>
     */
    ANDROID(3),
    /**
     * <pre>
     * Landing page doesn't work on iOS device.
     * </pre>
     *
     * <code>IOS = 4;</code>
     */
    IOS(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Landing page doesn't work on desktop device.
     * </pre>
     *
     * <code>DESKTOP = 2;</code>
     */
    public static final int DESKTOP_VALUE = 2;
    /**
     * <pre>
     * Landing page doesn't work on Android device.
     * </pre>
     *
     * <code>ANDROID = 3;</code>
     */
    public static final int ANDROID_VALUE = 3;
    /**
     * <pre>
     * Landing page doesn't work on iOS device.
     * </pre>
     *
     * <code>IOS = 4;</code>
     */
    public static final int IOS_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PolicyTopicEvidenceDestinationNotWorkingDevice valueOf(int value) {
      return forNumber(value);
    }

    public static PolicyTopicEvidenceDestinationNotWorkingDevice forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DESKTOP;
        case 3: return ANDROID;
        case 4: return IOS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PolicyTopicEvidenceDestinationNotWorkingDevice>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PolicyTopicEvidenceDestinationNotWorkingDevice> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PolicyTopicEvidenceDestinationNotWorkingDevice>() {
            public PolicyTopicEvidenceDestinationNotWorkingDevice findValueByNumber(int number) {
              return PolicyTopicEvidenceDestinationNotWorkingDevice.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PolicyTopicEvidenceDestinationNotWorkingDevice[] VALUES = values();

    public static PolicyTopicEvidenceDestinationNotWorkingDevice valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PolicyTopicEvidenceDestinationNotWorkingDevice(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.PolicyTopicEvidenceDestinationNotWorkingDevice)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum other = (com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible policy topic evidence destination not
   * working devices.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum)
      com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceProto.internal_static_google_ads_googleads_v1_enums_PolicyTopicEvidenceDestinationNotWorkingDeviceEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceProto.internal_static_google_ads_googleads_v1_enums_PolicyTopicEvidenceDestinationNotWorkingDeviceEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.class, com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceProto.internal_static_google_ads_googleads_v1_enums_PolicyTopicEvidenceDestinationNotWorkingDeviceEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum build() {
      com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum buildPartial() {
      com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum result = new com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum other) {
      if (other == com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum)
  private static final com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum();
  }

  public static com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyTopicEvidenceDestinationNotWorkingDeviceEnum>
      PARSER = new com.google.protobuf.AbstractParser<PolicyTopicEvidenceDestinationNotWorkingDeviceEnum>() {
    @java.lang.Override
    public PolicyTopicEvidenceDestinationNotWorkingDeviceEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PolicyTopicEvidenceDestinationNotWorkingDeviceEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyTopicEvidenceDestinationNotWorkingDeviceEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyTopicEvidenceDestinationNotWorkingDeviceEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.PolicyTopicEvidenceDestinationNotWorkingDeviceEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

