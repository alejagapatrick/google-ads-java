// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

public interface LocationGroupInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.LocationGroupInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Feed specifying locations for targeting.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed = 1;</code>
   */
  boolean hasFeed();
  /**
   * <pre>
   * Feed specifying locations for targeting.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed = 1;</code>
   */
  com.google.protobuf.StringValue getFeed();
  /**
   * <pre>
   * Feed specifying locations for targeting.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFeedOrBuilder();

  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue geo_target_constants = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getGeoTargetConstantsList();
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue geo_target_constants = 2;</code>
   */
  com.google.protobuf.StringValue getGeoTargetConstants(int index);
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue geo_target_constants = 2;</code>
   */
  int getGeoTargetConstantsCount();
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue geo_target_constants = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getGeoTargetConstantsOrBuilderList();
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue geo_target_constants = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getGeoTargetConstantsOrBuilder(
      int index);

  /**
   * <pre>
   * Distance in units specifying the radius around targeted locations.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value radius = 3;</code>
   */
  boolean hasRadius();
  /**
   * <pre>
   * Distance in units specifying the radius around targeted locations.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value radius = 3;</code>
   */
  com.google.protobuf.Int64Value getRadius();
  /**
   * <pre>
   * Distance in units specifying the radius around targeted locations.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value radius = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRadiusOrBuilder();

  /**
   * <pre>
   * Unit of the radius, miles and meters supported currently.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits radius_units = 4;</code>
   */
  int getRadiusUnitsValue();
  /**
   * <pre>
   * Unit of the radius, miles and meters supported currently.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits radius_units = 4;</code>
   */
  com.google.ads.googleads.v1.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits getRadiusUnits();
}
