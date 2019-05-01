// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/recommendation.proto

package com.google.ads.googleads.v1.resources;

public interface RecommendationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.Recommendation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the recommendation.
   * `customers/{customer_id}/recommendations/{recommendation_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the recommendation.
   * `customers/{customer_id}/recommendations/{recommendation_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The type of recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.RecommendationTypeEnum.RecommendationType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.RecommendationTypeEnum.RecommendationType type = 2;</code>
   */
  com.google.ads.googleads.v1.enums.RecommendationTypeEnum.RecommendationType getType();

  /**
   * <pre>
   * The impact on account performance as a result of applying the
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.RecommendationImpact impact = 3;</code>
   */
  boolean hasImpact();
  /**
   * <pre>
   * The impact on account performance as a result of applying the
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.RecommendationImpact impact = 3;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.RecommendationImpact getImpact();
  /**
   * <pre>
   * The impact on account performance as a result of applying the
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.RecommendationImpact impact = 3;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.RecommendationImpactOrBuilder getImpactOrBuilder();

  /**
   * <pre>
   * The budget targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign budget.
   * This field will be set for the following recommendation types:
   * CAMPAIGN_BUDGET
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 5;</code>
   */
  boolean hasCampaignBudget();
  /**
   * <pre>
   * The budget targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign budget.
   * This field will be set for the following recommendation types:
   * CAMPAIGN_BUDGET
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 5;</code>
   */
  com.google.protobuf.StringValue getCampaignBudget();
  /**
   * <pre>
   * The budget targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign budget.
   * This field will be set for the following recommendation types:
   * CAMPAIGN_BUDGET
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignBudgetOrBuilder();

  /**
   * <pre>
   * The campaign targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign.
   * This field will be set for the following recommendation types:
   * ENHANCED_CPC_OPT_IN, KEYWORD, MAXIMIZE_CLICKS_OPT_IN,
   * MAXIMIZE_CONVERSIONS_OPT_IN, OPTIMIZE_AD_ROTATION, SEARCH_PARTNERS_OPT_IN,
   * TARGET_CPA_OPT_IN, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 6;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign.
   * This field will be set for the following recommendation types:
   * ENHANCED_CPC_OPT_IN, KEYWORD, MAXIMIZE_CLICKS_OPT_IN,
   * MAXIMIZE_CONVERSIONS_OPT_IN, OPTIMIZE_AD_ROTATION, SEARCH_PARTNERS_OPT_IN,
   * TARGET_CPA_OPT_IN, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 6;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The campaign targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign.
   * This field will be set for the following recommendation types:
   * ENHANCED_CPC_OPT_IN, KEYWORD, MAXIMIZE_CLICKS_OPT_IN,
   * MAXIMIZE_CONVERSIONS_OPT_IN, OPTIMIZE_AD_ROTATION, SEARCH_PARTNERS_OPT_IN,
   * TARGET_CPA_OPT_IN, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The ad group targeted by this recommendation. This will be set only when
   * the recommendation affects a single ad group.
   * This field will be set for the following recommendation types:
   * KEYWORD, OPTIMIZE_AD_ROTATION, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 7;</code>
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * The ad group targeted by this recommendation. This will be set only when
   * the recommendation affects a single ad group.
   * This field will be set for the following recommendation types:
   * KEYWORD, OPTIMIZE_AD_ROTATION, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 7;</code>
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * The ad group targeted by this recommendation. This will be set only when
   * the recommendation affects a single ad group.
   * This field will be set for the following recommendation types:
   * KEYWORD, OPTIMIZE_AD_ROTATION, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * Whether the recommendation is dismissed or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue dismissed = 13;</code>
   */
  boolean hasDismissed();
  /**
   * <pre>
   * Whether the recommendation is dismissed or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue dismissed = 13;</code>
   */
  com.google.protobuf.BoolValue getDismissed();
  /**
   * <pre>
   * Whether the recommendation is dismissed or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue dismissed = 13;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getDismissedOrBuilder();

  /**
   * <pre>
   * The campaign budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CampaignBudgetRecommendation campaign_budget_recommendation = 4;</code>
   */
  boolean hasCampaignBudgetRecommendation();
  /**
   * <pre>
   * The campaign budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CampaignBudgetRecommendation campaign_budget_recommendation = 4;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.CampaignBudgetRecommendation getCampaignBudgetRecommendation();
  /**
   * <pre>
   * The campaign budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CampaignBudgetRecommendation campaign_budget_recommendation = 4;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.CampaignBudgetRecommendationOrBuilder getCampaignBudgetRecommendationOrBuilder();

  /**
   * <pre>
   * The keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.KeywordRecommendation keyword_recommendation = 8;</code>
   */
  boolean hasKeywordRecommendation();
  /**
   * <pre>
   * The keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.KeywordRecommendation keyword_recommendation = 8;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.KeywordRecommendation getKeywordRecommendation();
  /**
   * <pre>
   * The keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.KeywordRecommendation keyword_recommendation = 8;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.KeywordRecommendationOrBuilder getKeywordRecommendationOrBuilder();

  /**
   * <pre>
   * Add expanded text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.TextAdRecommendation text_ad_recommendation = 9;</code>
   */
  boolean hasTextAdRecommendation();
  /**
   * <pre>
   * Add expanded text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.TextAdRecommendation text_ad_recommendation = 9;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.TextAdRecommendation getTextAdRecommendation();
  /**
   * <pre>
   * Add expanded text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.TextAdRecommendation text_ad_recommendation = 9;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.TextAdRecommendationOrBuilder getTextAdRecommendationOrBuilder();

  /**
   * <pre>
   * The TargetCPA opt-in recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.TargetCpaOptInRecommendation target_cpa_opt_in_recommendation = 10;</code>
   */
  boolean hasTargetCpaOptInRecommendation();
  /**
   * <pre>
   * The TargetCPA opt-in recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.TargetCpaOptInRecommendation target_cpa_opt_in_recommendation = 10;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.TargetCpaOptInRecommendation getTargetCpaOptInRecommendation();
  /**
   * <pre>
   * The TargetCPA opt-in recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.TargetCpaOptInRecommendation target_cpa_opt_in_recommendation = 10;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.TargetCpaOptInRecommendationOrBuilder getTargetCpaOptInRecommendationOrBuilder();

  /**
   * <pre>
   * The MaximizeConversions Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MaximizeConversionsOptInRecommendation maximize_conversions_opt_in_recommendation = 11;</code>
   */
  boolean hasMaximizeConversionsOptInRecommendation();
  /**
   * <pre>
   * The MaximizeConversions Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MaximizeConversionsOptInRecommendation maximize_conversions_opt_in_recommendation = 11;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.MaximizeConversionsOptInRecommendation getMaximizeConversionsOptInRecommendation();
  /**
   * <pre>
   * The MaximizeConversions Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MaximizeConversionsOptInRecommendation maximize_conversions_opt_in_recommendation = 11;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.MaximizeConversionsOptInRecommendationOrBuilder getMaximizeConversionsOptInRecommendationOrBuilder();

  /**
   * <pre>
   * The Enhanced Cost-Per-Click Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.EnhancedCpcOptInRecommendation enhanced_cpc_opt_in_recommendation = 12;</code>
   */
  boolean hasEnhancedCpcOptInRecommendation();
  /**
   * <pre>
   * The Enhanced Cost-Per-Click Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.EnhancedCpcOptInRecommendation enhanced_cpc_opt_in_recommendation = 12;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.EnhancedCpcOptInRecommendation getEnhancedCpcOptInRecommendation();
  /**
   * <pre>
   * The Enhanced Cost-Per-Click Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.EnhancedCpcOptInRecommendation enhanced_cpc_opt_in_recommendation = 12;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.EnhancedCpcOptInRecommendationOrBuilder getEnhancedCpcOptInRecommendationOrBuilder();

  /**
   * <pre>
   * The Search Partners Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.SearchPartnersOptInRecommendation search_partners_opt_in_recommendation = 14;</code>
   */
  boolean hasSearchPartnersOptInRecommendation();
  /**
   * <pre>
   * The Search Partners Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.SearchPartnersOptInRecommendation search_partners_opt_in_recommendation = 14;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.SearchPartnersOptInRecommendation getSearchPartnersOptInRecommendation();
  /**
   * <pre>
   * The Search Partners Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.SearchPartnersOptInRecommendation search_partners_opt_in_recommendation = 14;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.SearchPartnersOptInRecommendationOrBuilder getSearchPartnersOptInRecommendationOrBuilder();

  /**
   * <pre>
   * The MaximizeClicks Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MaximizeClicksOptInRecommendation maximize_clicks_opt_in_recommendation = 15;</code>
   */
  boolean hasMaximizeClicksOptInRecommendation();
  /**
   * <pre>
   * The MaximizeClicks Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MaximizeClicksOptInRecommendation maximize_clicks_opt_in_recommendation = 15;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.MaximizeClicksOptInRecommendation getMaximizeClicksOptInRecommendation();
  /**
   * <pre>
   * The MaximizeClicks Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MaximizeClicksOptInRecommendation maximize_clicks_opt_in_recommendation = 15;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.MaximizeClicksOptInRecommendationOrBuilder getMaximizeClicksOptInRecommendationOrBuilder();

  /**
   * <pre>
   * The Optimize Ad Rotation recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.OptimizeAdRotationRecommendation optimize_ad_rotation_recommendation = 16;</code>
   */
  boolean hasOptimizeAdRotationRecommendation();
  /**
   * <pre>
   * The Optimize Ad Rotation recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.OptimizeAdRotationRecommendation optimize_ad_rotation_recommendation = 16;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.OptimizeAdRotationRecommendation getOptimizeAdRotationRecommendation();
  /**
   * <pre>
   * The Optimize Ad Rotation recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.OptimizeAdRotationRecommendation optimize_ad_rotation_recommendation = 16;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.OptimizeAdRotationRecommendationOrBuilder getOptimizeAdRotationRecommendationOrBuilder();

  /**
   * <pre>
   * The Callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CalloutExtensionRecommendation callout_extension_recommendation = 17;</code>
   */
  boolean hasCalloutExtensionRecommendation();
  /**
   * <pre>
   * The Callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CalloutExtensionRecommendation callout_extension_recommendation = 17;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.CalloutExtensionRecommendation getCalloutExtensionRecommendation();
  /**
   * <pre>
   * The Callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CalloutExtensionRecommendation callout_extension_recommendation = 17;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.CalloutExtensionRecommendationOrBuilder getCalloutExtensionRecommendationOrBuilder();

  /**
   * <pre>
   * The Sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.SitelinkExtensionRecommendation sitelink_extension_recommendation = 18;</code>
   */
  boolean hasSitelinkExtensionRecommendation();
  /**
   * <pre>
   * The Sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.SitelinkExtensionRecommendation sitelink_extension_recommendation = 18;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.SitelinkExtensionRecommendation getSitelinkExtensionRecommendation();
  /**
   * <pre>
   * The Sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.SitelinkExtensionRecommendation sitelink_extension_recommendation = 18;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.SitelinkExtensionRecommendationOrBuilder getSitelinkExtensionRecommendationOrBuilder();

  /**
   * <pre>
   * The Call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CallExtensionRecommendation call_extension_recommendation = 19;</code>
   */
  boolean hasCallExtensionRecommendation();
  /**
   * <pre>
   * The Call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CallExtensionRecommendation call_extension_recommendation = 19;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.CallExtensionRecommendation getCallExtensionRecommendation();
  /**
   * <pre>
   * The Call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.CallExtensionRecommendation call_extension_recommendation = 19;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.CallExtensionRecommendationOrBuilder getCallExtensionRecommendationOrBuilder();

  /**
   * <pre>
   * The keyword match type recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.KeywordMatchTypeRecommendation keyword_match_type_recommendation = 20;</code>
   */
  boolean hasKeywordMatchTypeRecommendation();
  /**
   * <pre>
   * The keyword match type recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.KeywordMatchTypeRecommendation keyword_match_type_recommendation = 20;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.KeywordMatchTypeRecommendation getKeywordMatchTypeRecommendation();
  /**
   * <pre>
   * The keyword match type recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.KeywordMatchTypeRecommendation keyword_match_type_recommendation = 20;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.KeywordMatchTypeRecommendationOrBuilder getKeywordMatchTypeRecommendationOrBuilder();

  /**
   * <pre>
   * The move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MoveUnusedBudgetRecommendation move_unused_budget_recommendation = 21;</code>
   */
  boolean hasMoveUnusedBudgetRecommendation();
  /**
   * <pre>
   * The move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MoveUnusedBudgetRecommendation move_unused_budget_recommendation = 21;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.MoveUnusedBudgetRecommendation getMoveUnusedBudgetRecommendation();
  /**
   * <pre>
   * The move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.Recommendation.MoveUnusedBudgetRecommendation move_unused_budget_recommendation = 21;</code>
   */
  com.google.ads.googleads.v1.resources.Recommendation.MoveUnusedBudgetRecommendationOrBuilder getMoveUnusedBudgetRecommendationOrBuilder();

  public com.google.ads.googleads.v1.resources.Recommendation.RecommendationCase getRecommendationCase();
}
