// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: parsing/parsing.proto
package com.squareup.protos.test.parsing;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class Shipment extends Message<Shipment, Shipment.Builder> {
  public static final ProtoAdapter<Shipment> ADAPTER = new ProtoAdapter_Shipment();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_SHIPMENT_ID = 0L;

  public static final String DEFAULT_SHIPMENT_TOKEN = "";

  public static final State DEFAULT_STATUS = State.VALIDATING;

  public static final Double DEFAULT_LOAD_RATIO = 0.0d;

  public static final Boolean DEFAULT_DELETED = false;

  public static final ByteString DEFAULT_SOURCE_SIGNATURE = ByteString.EMPTY;

  public static final ByteString DEFAULT_DESTINATION_SIGNATURE = ByteString.EMPTY;

  public static final String DEFAULT_ACCOUNT_TOKEN = "";

  public static final String DEFAULT_CARD_TOKEN = "";

  public static final String DEFAULT_TRANSFER_ID = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long shipment_id;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String shipment_token;

  @WireField(
      tag = 4,
      adapter = "com.squareup.protos.test.parsing.Warehouse#ADAPTER"
  )
  public final Warehouse source;

  @WireField(
      tag = 5,
      adapter = "com.squareup.protos.test.parsing.Warehouse#ADAPTER"
  )
  public final Warehouse destination;

  @WireField(
      tag = 6,
      adapter = "com.squareup.protos.test.parsing.Shipment$State#ADAPTER"
  )
  public final State status;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double load_ratio;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deleted;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString source_signature;

  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString destination_signature;

  @WireField(
      tag = 11,
      adapter = "com.squareup.protos.test.parsing.Warehouse#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Warehouse> nested_shipments;

  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> notes;

  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String account_token;

  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String card_token;

  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String transfer_id;

  public Shipment(Long shipment_id, String shipment_token, Warehouse source, Warehouse destination,
      State status, Double load_ratio, Boolean deleted, ByteString source_signature,
      ByteString destination_signature, List<Warehouse> nested_shipments, List<String> notes,
      String account_token, String card_token, String transfer_id) {
    this(shipment_id, shipment_token, source, destination, status, load_ratio, deleted, source_signature, destination_signature, nested_shipments, notes, account_token, card_token, transfer_id, ByteString.EMPTY);
  }

  public Shipment(Long shipment_id, String shipment_token, Warehouse source, Warehouse destination,
      State status, Double load_ratio, Boolean deleted, ByteString source_signature,
      ByteString destination_signature, List<Warehouse> nested_shipments, List<String> notes,
      String account_token, String card_token, String transfer_id, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    if (Internal.countNonNull(account_token, card_token, transfer_id) > 1) {
      throw new IllegalArgumentException("at most one of account_token, card_token, transfer_id may be non-null");
    }
    this.shipment_id = shipment_id;
    this.shipment_token = shipment_token;
    this.source = source;
    this.destination = destination;
    this.status = status;
    this.load_ratio = load_ratio;
    this.deleted = deleted;
    this.source_signature = source_signature;
    this.destination_signature = destination_signature;
    this.nested_shipments = Internal.immutableCopyOf("nested_shipments", nested_shipments);
    this.notes = Internal.immutableCopyOf("notes", notes);
    this.account_token = account_token;
    this.card_token = card_token;
    this.transfer_id = transfer_id;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.shipment_id = shipment_id;
    builder.shipment_token = shipment_token;
    builder.source = source;
    builder.destination = destination;
    builder.status = status;
    builder.load_ratio = load_ratio;
    builder.deleted = deleted;
    builder.source_signature = source_signature;
    builder.destination_signature = destination_signature;
    builder.nested_shipments = Internal.copyOf("nested_shipments", nested_shipments);
    builder.notes = Internal.copyOf("notes", notes);
    builder.account_token = account_token;
    builder.card_token = card_token;
    builder.transfer_id = transfer_id;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Shipment)) return false;
    Shipment o = (Shipment) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(shipment_id, o.shipment_id)
        && Internal.equals(shipment_token, o.shipment_token)
        && Internal.equals(source, o.source)
        && Internal.equals(destination, o.destination)
        && Internal.equals(status, o.status)
        && Internal.equals(load_ratio, o.load_ratio)
        && Internal.equals(deleted, o.deleted)
        && Internal.equals(source_signature, o.source_signature)
        && Internal.equals(destination_signature, o.destination_signature)
        && nested_shipments.equals(o.nested_shipments)
        && notes.equals(o.notes)
        && Internal.equals(account_token, o.account_token)
        && Internal.equals(card_token, o.card_token)
        && Internal.equals(transfer_id, o.transfer_id);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (shipment_id != null ? shipment_id.hashCode() : 0);
      result = result * 37 + (shipment_token != null ? shipment_token.hashCode() : 0);
      result = result * 37 + (source != null ? source.hashCode() : 0);
      result = result * 37 + (destination != null ? destination.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (load_ratio != null ? load_ratio.hashCode() : 0);
      result = result * 37 + (deleted != null ? deleted.hashCode() : 0);
      result = result * 37 + (source_signature != null ? source_signature.hashCode() : 0);
      result = result * 37 + (destination_signature != null ? destination_signature.hashCode() : 0);
      result = result * 37 + nested_shipments.hashCode();
      result = result * 37 + notes.hashCode();
      result = result * 37 + (account_token != null ? account_token.hashCode() : 0);
      result = result * 37 + (card_token != null ? card_token.hashCode() : 0);
      result = result * 37 + (transfer_id != null ? transfer_id.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (shipment_id != null) builder.append(", shipment_id=").append(shipment_id);
    if (shipment_token != null) builder.append(", shipment_token=").append(shipment_token);
    if (source != null) builder.append(", source=").append(source);
    if (destination != null) builder.append(", destination=").append(destination);
    if (status != null) builder.append(", status=").append(status);
    if (load_ratio != null) builder.append(", load_ratio=").append(load_ratio);
    if (deleted != null) builder.append(", deleted=").append(deleted);
    if (source_signature != null) builder.append(", source_signature=").append(source_signature);
    if (destination_signature != null) builder.append(", destination_signature=").append(destination_signature);
    if (!nested_shipments.isEmpty()) builder.append(", nested_shipments=").append(nested_shipments);
    if (!notes.isEmpty()) builder.append(", notes=").append(notes);
    if (account_token != null) builder.append(", account_token=").append(account_token);
    if (card_token != null) builder.append(", card_token=").append(card_token);
    if (transfer_id != null) builder.append(", transfer_id=").append(transfer_id);
    return builder.replace(0, 2, "Shipment{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Shipment, Builder> {
    public Long shipment_id;

    public String shipment_token;

    public Warehouse source;

    public Warehouse destination;

    public State status;

    public Double load_ratio;

    public Boolean deleted;

    public ByteString source_signature;

    public ByteString destination_signature;

    public List<Warehouse> nested_shipments;

    public List<String> notes;

    public String account_token;

    public String card_token;

    public String transfer_id;

    public Builder() {
      nested_shipments = Internal.newMutableList();
      notes = Internal.newMutableList();
    }

    public Builder shipment_id(Long shipment_id) {
      this.shipment_id = shipment_id;
      return this;
    }

    public Builder shipment_token(String shipment_token) {
      this.shipment_token = shipment_token;
      return this;
    }

    public Builder source(Warehouse source) {
      this.source = source;
      return this;
    }

    public Builder destination(Warehouse destination) {
      this.destination = destination;
      return this;
    }

    public Builder status(State status) {
      this.status = status;
      return this;
    }

    public Builder load_ratio(Double load_ratio) {
      this.load_ratio = load_ratio;
      return this;
    }

    public Builder deleted(Boolean deleted) {
      this.deleted = deleted;
      return this;
    }

    public Builder source_signature(ByteString source_signature) {
      this.source_signature = source_signature;
      return this;
    }

    public Builder destination_signature(ByteString destination_signature) {
      this.destination_signature = destination_signature;
      return this;
    }

    public Builder nested_shipments(List<Warehouse> nested_shipments) {
      Internal.checkElementsNotNull(nested_shipments);
      this.nested_shipments = nested_shipments;
      return this;
    }

    public Builder notes(List<String> notes) {
      Internal.checkElementsNotNull(notes);
      this.notes = notes;
      return this;
    }

    public Builder account_token(String account_token) {
      this.account_token = account_token;
      this.card_token = null;
      this.transfer_id = null;
      return this;
    }

    public Builder card_token(String card_token) {
      this.card_token = card_token;
      this.account_token = null;
      this.transfer_id = null;
      return this;
    }

    public Builder transfer_id(String transfer_id) {
      this.transfer_id = transfer_id;
      this.account_token = null;
      this.card_token = null;
      return this;
    }

    @Override
    public Shipment build() {
      return new Shipment(shipment_id, shipment_token, source, destination, status, load_ratio, deleted, source_signature, destination_signature, nested_shipments, notes, account_token, card_token, transfer_id, super.buildUnknownFields());
    }
  }

  public enum State implements WireEnum {
    VALIDATING(0),

    PICKING_UP(1),

    DELIVERING(2),

    CONSUMING(4);

    public static final ProtoAdapter<State> ADAPTER = new ProtoAdapter_State();

    private final int value;

    State(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static State fromValue(int value) {
      switch (value) {
        case 0: return VALIDATING;
        case 1: return PICKING_UP;
        case 2: return DELIVERING;
        case 4: return CONSUMING;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_State extends EnumAdapter<State> {
      ProtoAdapter_State() {
        super(State.class);
      }

      @Override
      protected State fromValue(int value) {
        return State.fromValue(value);
      }
    }
  }

  private static final class ProtoAdapter_Shipment extends ProtoAdapter<Shipment> {
    public ProtoAdapter_Shipment() {
      super(FieldEncoding.LENGTH_DELIMITED, Shipment.class);
    }

    @Override
    public int encodedSize(Shipment value) {
      return ProtoAdapter.INT64.encodedSizeWithTag(1, value.shipment_id)
          + ProtoAdapter.STRING.encodedSizeWithTag(2, value.shipment_token)
          + Warehouse.ADAPTER.encodedSizeWithTag(4, value.source)
          + Warehouse.ADAPTER.encodedSizeWithTag(5, value.destination)
          + State.ADAPTER.encodedSizeWithTag(6, value.status)
          + ProtoAdapter.DOUBLE.encodedSizeWithTag(7, value.load_ratio)
          + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.deleted)
          + ProtoAdapter.BYTES.encodedSizeWithTag(9, value.source_signature)
          + ProtoAdapter.BYTES.encodedSizeWithTag(10, value.destination_signature)
          + Warehouse.ADAPTER.asRepeated().encodedSizeWithTag(11, value.nested_shipments)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, value.notes)
          + ProtoAdapter.STRING.encodedSizeWithTag(13, value.account_token)
          + ProtoAdapter.STRING.encodedSizeWithTag(14, value.card_token)
          + ProtoAdapter.STRING.encodedSizeWithTag(15, value.transfer_id)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Shipment value) throws IOException {
      ProtoAdapter.INT64.encodeWithTag(writer, 1, value.shipment_id);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.shipment_token);
      Warehouse.ADAPTER.encodeWithTag(writer, 4, value.source);
      Warehouse.ADAPTER.encodeWithTag(writer, 5, value.destination);
      State.ADAPTER.encodeWithTag(writer, 6, value.status);
      ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, value.load_ratio);
      ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.deleted);
      ProtoAdapter.BYTES.encodeWithTag(writer, 9, value.source_signature);
      ProtoAdapter.BYTES.encodeWithTag(writer, 10, value.destination_signature);
      Warehouse.ADAPTER.asRepeated().encodeWithTag(writer, 11, value.nested_shipments);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 12, value.notes);
      ProtoAdapter.STRING.encodeWithTag(writer, 13, value.account_token);
      ProtoAdapter.STRING.encodeWithTag(writer, 14, value.card_token);
      ProtoAdapter.STRING.encodeWithTag(writer, 15, value.transfer_id);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Shipment decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.shipment_id(ProtoAdapter.INT64.decode(reader)); break;
          case 2: builder.shipment_token(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.source(Warehouse.ADAPTER.decode(reader)); break;
          case 5: builder.destination(Warehouse.ADAPTER.decode(reader)); break;
          case 6: {
            try {
              builder.status(State.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 7: builder.load_ratio(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 8: builder.deleted(ProtoAdapter.BOOL.decode(reader)); break;
          case 9: builder.source_signature(ProtoAdapter.BYTES.decode(reader)); break;
          case 10: builder.destination_signature(ProtoAdapter.BYTES.decode(reader)); break;
          case 11: builder.nested_shipments.add(Warehouse.ADAPTER.decode(reader)); break;
          case 12: builder.notes.add(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.account_token(ProtoAdapter.STRING.decode(reader)); break;
          case 14: builder.card_token(ProtoAdapter.STRING.decode(reader)); break;
          case 15: builder.transfer_id(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public Shipment redact(Shipment value) {
      Builder builder = value.newBuilder();
      if (builder.source != null) builder.source = Warehouse.ADAPTER.redact(builder.source);
      if (builder.destination != null) builder.destination = Warehouse.ADAPTER.redact(builder.destination);
      Internal.redactElements(builder.nested_shipments, Warehouse.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}