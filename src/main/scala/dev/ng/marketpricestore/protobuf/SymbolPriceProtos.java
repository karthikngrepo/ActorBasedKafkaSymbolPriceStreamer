// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SymbolPrice.proto

package dev.ng.marketpricestore.protobuf;

public final class SymbolPriceProtos {
  private SymbolPriceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SymbolPriceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.SymbolPrice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string price = 1;</code>
     */
    java.lang.String getPrice();
    /**
     * <code>string price = 1;</code>
     */
    com.google.protobuf.ByteString
        getPriceBytes();

    /**
     * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
     */
    int getSymbolValue();
    /**
     * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
     */
    dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol getSymbol();

    /**
     * <code>string unit = 3;</code>
     */
    java.lang.String getUnit();
    /**
     * <code>string unit = 3;</code>
     */
    com.google.protobuf.ByteString
        getUnitBytes();

    /**
     * <code>string time = 4;</code>
     */
    java.lang.String getTime();
    /**
     * <code>string time = 4;</code>
     */
    com.google.protobuf.ByteString
        getTimeBytes();
  }
  /**
   * Protobuf type {@code protobuf.SymbolPrice}
   */
  public  static final class SymbolPrice extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.SymbolPrice)
      SymbolPriceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SymbolPrice.newBuilder() to construct.
    private SymbolPrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SymbolPrice() {
      price_ = "";
      symbol_ = 0;
      unit_ = "";
      time_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SymbolPrice(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              price_ = s;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              symbol_ = rawValue;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              unit_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              time_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.internal_static_protobuf_SymbolPrice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.internal_static_protobuf_SymbolPrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.class, dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Builder.class);
    }

    /**
     * Protobuf enum {@code protobuf.SymbolPrice.Symbol}
     */
    public enum Symbol
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>Gold = 0;</code>
       */
      Gold(0),
      /**
       * <code>Silver = 1;</code>
       */
      Silver(1),
      /**
       * <code>Platinum = 2;</code>
       */
      Platinum(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>Gold = 0;</code>
       */
      public static final int Gold_VALUE = 0;
      /**
       * <code>Silver = 1;</code>
       */
      public static final int Silver_VALUE = 1;
      /**
       * <code>Platinum = 2;</code>
       */
      public static final int Platinum_VALUE = 2;


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
      public static Symbol valueOf(int value) {
        return forNumber(value);
      }

      public static Symbol forNumber(int value) {
        switch (value) {
          case 0: return Gold;
          case 1: return Silver;
          case 2: return Platinum;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Symbol>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Symbol> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Symbol>() {
              public Symbol findValueByNumber(int number) {
                return Symbol.forNumber(number);
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
        return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.getDescriptor().getEnumTypes().get(0);
      }

      private static final Symbol[] VALUES = values();

      public static Symbol valueOf(
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

      private Symbol(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:protobuf.SymbolPrice.Symbol)
    }

    public static final int PRICE_FIELD_NUMBER = 1;
    private volatile java.lang.Object price_;
    /**
     * <code>string price = 1;</code>
     */
    public java.lang.String getPrice() {
      java.lang.Object ref = price_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        price_ = s;
        return s;
      }
    }
    /**
     * <code>string price = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPriceBytes() {
      java.lang.Object ref = price_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        price_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SYMBOL_FIELD_NUMBER = 2;
    private int symbol_;
    /**
     * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
     */
    public int getSymbolValue() {
      return symbol_;
    }
    /**
     * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
     */
    public dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol getSymbol() {
      @SuppressWarnings("deprecation")
      dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol result = dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol.valueOf(symbol_);
      return result == null ? dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol.UNRECOGNIZED : result;
    }

    public static final int UNIT_FIELD_NUMBER = 3;
    private volatile java.lang.Object unit_;
    /**
     * <code>string unit = 3;</code>
     */
    public java.lang.String getUnit() {
      java.lang.Object ref = unit_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unit_ = s;
        return s;
      }
    }
    /**
     * <code>string unit = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUnitBytes() {
      java.lang.Object ref = unit_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 4;
    private volatile java.lang.Object time_;
    /**
     * <code>string time = 4;</code>
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        time_ = s;
        return s;
      }
    }
    /**
     * <code>string time = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getPriceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, price_);
      }
      if (symbol_ != dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol.Gold.getNumber()) {
        output.writeEnum(2, symbol_);
      }
      if (!getUnitBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unit_);
      }
      if (!getTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, time_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getPriceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, price_);
      }
      if (symbol_ != dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol.Gold.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, symbol_);
      }
      if (!getUnitBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, unit_);
      }
      if (!getTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, time_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice)) {
        return super.equals(obj);
      }
      dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice other = (dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice) obj;

      if (!getPrice()
          .equals(other.getPrice())) return false;
      if (symbol_ != other.symbol_) return false;
      if (!getUnit()
          .equals(other.getUnit())) return false;
      if (!getTime()
          .equals(other.getTime())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice().hashCode();
      hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
      hash = (53 * hash) + symbol_;
      hash = (37 * hash) + UNIT_FIELD_NUMBER;
      hash = (53 * hash) + getUnit().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parseFrom(
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
    public static Builder newBuilder(dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice prototype) {
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
     * Protobuf type {@code protobuf.SymbolPrice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.SymbolPrice)
        dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPriceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.internal_static_protobuf_SymbolPrice_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.internal_static_protobuf_SymbolPrice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.class, dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Builder.class);
      }

      // Construct using dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.newBuilder()
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
        price_ = "";

        symbol_ = 0;

        unit_ = "";

        time_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.internal_static_protobuf_SymbolPrice_descriptor;
      }

      @java.lang.Override
      public dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice getDefaultInstanceForType() {
        return dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.getDefaultInstance();
      }

      @java.lang.Override
      public dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice build() {
        dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice buildPartial() {
        dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice result = new dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice(this);
        result.price_ = price_;
        result.symbol_ = symbol_;
        result.unit_ = unit_;
        result.time_ = time_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice) {
          return mergeFrom((dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice other) {
        if (other == dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.getDefaultInstance()) return this;
        if (!other.getPrice().isEmpty()) {
          price_ = other.price_;
          onChanged();
        }
        if (other.symbol_ != 0) {
          setSymbolValue(other.getSymbolValue());
        }
        if (!other.getUnit().isEmpty()) {
          unit_ = other.unit_;
          onChanged();
        }
        if (!other.getTime().isEmpty()) {
          time_ = other.time_;
          onChanged();
        }
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
        dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object price_ = "";
      /**
       * <code>string price = 1;</code>
       */
      public java.lang.String getPrice() {
        java.lang.Object ref = price_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          price_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string price = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPriceBytes() {
        java.lang.Object ref = price_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          price_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string price = 1;</code>
       */
      public Builder setPrice(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string price = 1;</code>
       */
      public Builder clearPrice() {
        
        price_ = getDefaultInstance().getPrice();
        onChanged();
        return this;
      }
      /**
       * <code>string price = 1;</code>
       */
      public Builder setPriceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        price_ = value;
        onChanged();
        return this;
      }

      private int symbol_ = 0;
      /**
       * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
       */
      public int getSymbolValue() {
        return symbol_;
      }
      /**
       * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
       */
      public Builder setSymbolValue(int value) {
        symbol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
       */
      public dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol getSymbol() {
        @SuppressWarnings("deprecation")
        dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol result = dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol.valueOf(symbol_);
        return result == null ? dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol.UNRECOGNIZED : result;
      }
      /**
       * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
       */
      public Builder setSymbol(dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice.Symbol value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        symbol_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.protobuf.SymbolPrice.Symbol symbol = 2;</code>
       */
      public Builder clearSymbol() {
        
        symbol_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object unit_ = "";
      /**
       * <code>string unit = 3;</code>
       */
      public java.lang.String getUnit() {
        java.lang.Object ref = unit_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unit_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string unit = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUnitBytes() {
        java.lang.Object ref = unit_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unit_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string unit = 3;</code>
       */
      public Builder setUnit(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string unit = 3;</code>
       */
      public Builder clearUnit() {
        
        unit_ = getDefaultInstance().getUnit();
        onChanged();
        return this;
      }
      /**
       * <code>string unit = 3;</code>
       */
      public Builder setUnitBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unit_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object time_ = "";
      /**
       * <code>string time = 4;</code>
       */
      public java.lang.String getTime() {
        java.lang.Object ref = time_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          time_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string time = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTimeBytes() {
        java.lang.Object ref = time_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          time_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string time = 4;</code>
       */
      public Builder setTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string time = 4;</code>
       */
      public Builder clearTime() {
        
        time_ = getDefaultInstance().getTime();
        onChanged();
        return this;
      }
      /**
       * <code>string time = 4;</code>
       */
      public Builder setTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        time_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protobuf.SymbolPrice)
    }

    // @@protoc_insertion_point(class_scope:protobuf.SymbolPrice)
    private static final dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice();
    }

    public static dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SymbolPrice>
        PARSER = new com.google.protobuf.AbstractParser<SymbolPrice>() {
      @java.lang.Override
      public SymbolPrice parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SymbolPrice(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SymbolPrice> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SymbolPrice> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public dev.ng.marketpricestore.protobuf.SymbolPriceProtos.SymbolPrice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_SymbolPrice_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_SymbolPrice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021SymbolPrice.proto\022\010protobuf\"\224\001\n\013Symbol" +
      "Price\022\r\n\005price\030\001 \001(\t\022,\n\006symbol\030\002 \001(\0162\034.p" +
      "rotobuf.SymbolPrice.Symbol\022\014\n\004unit\030\003 \001(\t" +
      "\022\014\n\004time\030\004 \001(\t\",\n\006Symbol\022\010\n\004Gold\020\000\022\n\n\006Si" +
      "lver\020\001\022\014\n\010Platinum\020\002B5\n dev.ng.marketpri" +
      "cestore.protobufB\021SymbolPriceProtosb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protobuf_SymbolPrice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_SymbolPrice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_SymbolPrice_descriptor,
        new java.lang.String[] { "Price", "Symbol", "Unit", "Time", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
