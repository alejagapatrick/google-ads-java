// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the license.
package com.google.ads.googleads.v1.utils;

import com.google.ads.googleads.v1.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v1.enums.FeedItemTargetTypeEnum.FeedItemTargetType;
import com.google.ads.googleads.v1.enums.GeoTargetingTypeEnum.GeoTargetingType;
import com.google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v1.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel;
import com.google.ads.googleads.v1.enums.SimulationModificationMethodEnum.SimulationModificationMethod;
import com.google.ads.googleads.v1.enums.SimulationTypeEnum.SimulationType;
import com.google.ads.googleads.v1.resources.AccountBudgetName;
import com.google.ads.googleads.v1.resources.AccountBudgetProposalName;
import com.google.ads.googleads.v1.resources.AdGroupAdLabelName;
import com.google.ads.googleads.v1.resources.AdGroupAdName;
import com.google.ads.googleads.v1.resources.AdGroupAudienceViewName;
import com.google.ads.googleads.v1.resources.AdGroupBidModifierName;
import com.google.ads.googleads.v1.resources.AdGroupCriteriaName;
import com.google.ads.googleads.v1.resources.AdGroupCriterionLabelName;
import com.google.ads.googleads.v1.resources.AdGroupCriterionSimulationName;
import com.google.ads.googleads.v1.resources.AdGroupExtensionSettingName;
import com.google.ads.googleads.v1.resources.AdGroupFeedName;
import com.google.ads.googleads.v1.resources.AdGroupLabelName;
import com.google.ads.googleads.v1.resources.AdGroupName;
import com.google.ads.googleads.v1.resources.AdGroupSimulationName;
import com.google.ads.googleads.v1.resources.AdParameterName;
import com.google.ads.googleads.v1.resources.AdScheduleViewName;
import com.google.ads.googleads.v1.resources.AgeRangeViewName;
import com.google.ads.googleads.v1.resources.AssetName;
import com.google.ads.googleads.v1.resources.BiddingStrategyName;
import com.google.ads.googleads.v1.resources.BillingSetupName;
import com.google.ads.googleads.v1.resources.CampaignAudienceViewName;
import com.google.ads.googleads.v1.resources.CampaignBidModifierName;
import com.google.ads.googleads.v1.resources.CampaignBudgetName;
import com.google.ads.googleads.v1.resources.CampaignCriteriaName;
import com.google.ads.googleads.v1.resources.CampaignCriterionSimulationName;
import com.google.ads.googleads.v1.resources.CampaignExtensionSettingName;
import com.google.ads.googleads.v1.resources.CampaignFeedName;
import com.google.ads.googleads.v1.resources.CampaignLabelName;
import com.google.ads.googleads.v1.resources.CampaignName;
import com.google.ads.googleads.v1.resources.CampaignSharedSetName;
import com.google.ads.googleads.v1.resources.CarrierConstantName;
import com.google.ads.googleads.v1.resources.ChangeStatusName;
import com.google.ads.googleads.v1.resources.ClickViewName;
import com.google.ads.googleads.v1.resources.ConversionActionName;
import com.google.ads.googleads.v1.resources.CustomInterestName;
import com.google.ads.googleads.v1.resources.CustomerClientLinkName;
import com.google.ads.googleads.v1.resources.CustomerClientName;
import com.google.ads.googleads.v1.resources.CustomerExtensionSettingName;
import com.google.ads.googleads.v1.resources.CustomerFeedName;
import com.google.ads.googleads.v1.resources.CustomerLabelName;
import com.google.ads.googleads.v1.resources.CustomerManagerLinkName;
import com.google.ads.googleads.v1.resources.CustomerName;
import com.google.ads.googleads.v1.resources.CustomerNegativeCriteriaName;
import com.google.ads.googleads.v1.resources.DetailPlacementViewName;
import com.google.ads.googleads.v1.resources.DisplayKeywordViewName;
import com.google.ads.googleads.v1.resources.DomainCategoryName;
import com.google.ads.googleads.v1.resources.DynamicSearchAdsSearchTermViewName;
import com.google.ads.googleads.v1.resources.ExpandedLandingPageViewName;
import com.google.ads.googleads.v1.resources.ExtensionFeedItemName;
import com.google.ads.googleads.v1.resources.FeedItemName;
import com.google.ads.googleads.v1.resources.FeedItemTargetName;
import com.google.ads.googleads.v1.resources.FeedMappingName;
import com.google.ads.googleads.v1.resources.FeedName;
import com.google.ads.googleads.v1.resources.FeedPlaceholderViewName;
import com.google.ads.googleads.v1.resources.GenderViewName;
import com.google.ads.googleads.v1.resources.GeoTargetConstantName;
import com.google.ads.googleads.v1.resources.GeographicViewName;
import com.google.ads.googleads.v1.resources.GoogleAdsFieldName;
import com.google.ads.googleads.v1.resources.GroupPlacementViewName;
import com.google.ads.googleads.v1.resources.HotelGroupViewName;
import com.google.ads.googleads.v1.resources.HotelPerformanceViewName;
import com.google.ads.googleads.v1.resources.KeywordPlanAdGroupName;
import com.google.ads.googleads.v1.resources.KeywordPlanCampaignName;
import com.google.ads.googleads.v1.resources.KeywordPlanKeywordName;
import com.google.ads.googleads.v1.resources.KeywordPlanName;
import com.google.ads.googleads.v1.resources.KeywordPlanNegativeKeywordName;
import com.google.ads.googleads.v1.resources.KeywordViewName;
import com.google.ads.googleads.v1.resources.LabelName;
import com.google.ads.googleads.v1.resources.LandingPageViewName;
import com.google.ads.googleads.v1.resources.LanguageConstantName;
import com.google.ads.googleads.v1.resources.LocationViewName;
import com.google.ads.googleads.v1.resources.ManagedPlacementViewName;
import com.google.ads.googleads.v1.resources.MediaFileName;
import com.google.ads.googleads.v1.resources.MerchantCenterLinkName;
import com.google.ads.googleads.v1.resources.MobileAppCategoryConstantName;
import com.google.ads.googleads.v1.resources.MobileDeviceConstantName;
import com.google.ads.googleads.v1.resources.MutateJobName;
import com.google.ads.googleads.v1.resources.OperatingSystemVersionConstantName;
import com.google.ads.googleads.v1.resources.PaidOrganicSearchTermViewName;
import com.google.ads.googleads.v1.resources.ParentalStatusViewName;
import com.google.ads.googleads.v1.resources.ProductBiddingCategoryConstantName;
import com.google.ads.googleads.v1.resources.ProductGroupViewName;
import com.google.ads.googleads.v1.resources.RecommendationName;
import com.google.ads.googleads.v1.resources.RemarketingActionName;
import com.google.ads.googleads.v1.resources.SearchTermViewName;
import com.google.ads.googleads.v1.resources.SharedCriteriaName;
import com.google.ads.googleads.v1.resources.SharedSetName;
import com.google.ads.googleads.v1.resources.ShoppingPerformanceViewName;
import com.google.ads.googleads.v1.resources.TopicConstantName;
import com.google.ads.googleads.v1.resources.TopicViewName;
import com.google.ads.googleads.v1.resources.UserInterestName;
import com.google.ads.googleads.v1.resources.UserListName;
import com.google.ads.googleads.v1.resources.VideoName;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utilities for generating resource names. Offers several advantages over the utilities in the
 * various {@code *Name} classes.
 *
 * <ul>
 *   <li>Method parameter types match the type of each identifier. For example, the {@code
 *       campaignId} parameter of {@link #campaign(long, long)} is of type {@code long}. In
 *       contrast, the {@code campaign} parameter of {@link CampaignName#format(String, String)} is
 *       of type {@code String}.
 *   <li>Method parameter lists contain each component identifier. For example, {@link
 *       #adGroupCriterion(long, long, long)} expects a customer ID, an ad group ID, and a criterion
 *       ID. In contrast, {@link AdGroupCriteriaName#format(String, String)} expects a customer ID
 *       and an underscore-delimited combination of ad group ID and criterion ID.
 * </ul>
 */
public class ResourceNames {
  /** Returns the account budget resource name for the specified components. */
  public static String accountBudget(long customerId, long accountBudgetId) {
    return AccountBudgetName.format(String.valueOf(customerId), String.valueOf(accountBudgetId));
  }

  /** Returns the account budget proposal resource name for the specified components. */
  public static String accountBudgetProposal(long customerId, long accountBudgetProposalId) {
    return AccountBudgetProposalName.format(
        String.valueOf(customerId), String.valueOf(accountBudgetProposalId));
  }

  /** Returns the ad group resource name for the specified components. */
  public static String adGroup(long customerId, long adGroupId) {
    return AdGroupName.format(String.valueOf(customerId), String.valueOf(adGroupId));
  }

  /** Returns the ad group ad resource name for the specified components. */
  public static String adGroupAd(long customerId, long adGroupId, long adId) {
    return AdGroupAdName.format(String.valueOf(customerId), concatIdentifiers(adGroupId, adId));
  }

  /** Returns the ad group ad label for the specified components. */
  public static String adGroupAdLabel(long customerId, long adGroupId, long adId, long labelId) {
    return AdGroupAdLabelName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, adId, labelId));
  }

  /** Returns the ad group audience view resource name for the specified components. */
  public static String adGroupAudienceView(long customerId, long adGroupId, long criterionId) {
    return AdGroupAudienceViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the ad group bid modifier resource name for the specified components. */
  public static String adGroupBidModifier(long customerId, long adGroupId, long criterionId) {
    return AdGroupBidModifierName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the ad group criterion resource name for the specified components. */
  public static String adGroupCriterion(long customerId, long adGroupId, long criterionId) {
    return AdGroupCriteriaName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the ad group criterion label for the specified components. */
  public static String adGroupCriterionLabel(
      long customerId, long adGroupId, long criterionId, long labelId) {
    return AdGroupCriterionLabelName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId, labelId));
  }

  /** Returns the Ad Group Criterion Simulation resource name for the specified components. */
  public static String adGroupCriterionSimulation(
      long customerId,
      long adGroupId,
      long criterionId,
      SimulationType type,
      SimulationModificationMethod method,
      String startDate,
      String endDate) {
    return AdGroupCriterionSimulationName.format(
        String.valueOf(customerId),
        concatIdentifiers(adGroupId, criterionId, type, method, startDate, endDate));
  }

  /** Returns the ad group extension setting for the specified components. */
  public static String adGroupExtensionSetting(
      long customerId, long adGroupId, ExtensionType extensionType) {
    return AdGroupExtensionSettingName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, extensionType.name()));
  }

  /** Returns the ad group feed resource name for the specified components. */
  public static String adGroupFeed(long customerId, long adGroupId, long feedId) {
    return AdGroupFeedName.format(String.valueOf(customerId), concatIdentifiers(adGroupId, feedId));
  }

  /** Returns the ad group label for the specified components. */
  public static String adGroupLabel(long customerId, long adGroupId, long labelId) {
    return AdGroupLabelName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, labelId));
  }

  /** Returns the Ad Group Simulation resource name for the specified components. */
  public static String adGroupSimulation(
      long customerId,
      long adGroupId,
      SimulationType type,
      SimulationModificationMethod method,
      String startDate,
      String endDate) {
    return AdGroupSimulationName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, type, method, startDate, endDate));
  }

  /** Returns the ad parameter resource name for the specified components. */
  public static String adParameter(
      long customerId, long adGroupId, long criterionId, long parameterIndex) {
    return AdParameterName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId, parameterIndex));
  }

  /** Returns the ad schedule view resource name for the specified components. */
  public static String adScheduleView(long customerId, long campaignId, long criterionId) {
    return AdScheduleViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the age range view resource name for the specified components. */
  public static String ageRangeView(long customerId, long adGroupId, long criterionId) {
    return AgeRangeViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the Asset resource name for the specified components. */
  public static String asset(long customerId, long assetId) {
    return AssetName.format(String.valueOf(customerId), String.valueOf(assetId));
  }

  /** Returns the bidding strategy resource name for the specified components. */
  public static String biddingStrategy(long customerId, long biddingStrategyId) {
    return BiddingStrategyName.format(
        String.valueOf(customerId), String.valueOf(biddingStrategyId));
  }

  /** Returns the billing setup resource name for the specified components. */
  public static String billingSetup(long customerId, long billingSetupId) {
    return BillingSetupName.format(String.valueOf(customerId), String.valueOf(billingSetupId));
  }

  /** Returns the campaign resource name for the specified components. */
  public static String campaign(long customerId, long campaignId) {
    return CampaignName.format(String.valueOf(customerId), String.valueOf(campaignId));
  }

  /** Returns the campaign audience view resource name for the specified components. */
  public static String campaignAudienceView(long customerId, long campaignId, long criterionId) {
    return CampaignAudienceViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the campaign bid modifier resource name for the specified components. */
  public static String campaignBidModifier(long customerId, long campaignId, long criterionId) {
    return CampaignBidModifierName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the campaign budget resource name for the specified components. */
  public static String campaignBudget(long customerId, long budgetId) {
    return CampaignBudgetName.format(String.valueOf(customerId), String.valueOf(budgetId));
  }

  /** Returns the campaign criterion resource name for the specified components. */
  public static String campaignCriterion(long customerId, long campaignId, long criterionId) {
    return CampaignCriteriaName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the Campaign Criterion Simulation resource name for the specified components. */
  public static String campaignCriterionSimulation(
      long customerId,
      long campaignId,
      SimulationType type,
      SimulationModificationMethod method,
      String startDate,
      String endDate) {
    return CampaignCriterionSimulationName.format(
        String.valueOf(customerId),
        concatIdentifiers(campaignId, type, method, startDate, endDate));
  }

  /** Returns the campaign extension setting for the specified components. */
  public static String campaignExtensionSetting(
      long customerId, long campaignId, ExtensionType extensionType) {
    return CampaignExtensionSettingName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, extensionType.name()));
  }

  /** Returns the campaign feed resource name for the specified components. */
  public static String campaignFeed(long customerId, long campaignId, long feedId) {
    return CampaignFeedName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, feedId));
  }

  /** Returns the campaign label for the specified components. */
  public static String campaignLabel(long customerId, long campaignId, long labelId) {
    return CampaignLabelName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, labelId));
  }

  /** Returns the campaign shared set resource name for the specified components. */
  public static String campaignSharedSet(long customerId, long campaignId, long sharedSetId) {
    return CampaignSharedSetName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, sharedSetId));
  }

  /** Returns the carrier constant resource name for the specified components. */
  public static String carrierConstant(long criterionId) {
    return CarrierConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the change status resource name for the specified components. */
  public static String changeStatus(long customerId, String changeStatusId) {
    return ChangeStatusName.format(String.valueOf(customerId), changeStatusId);
  }

  /** Returns the click view for the specified components. */
  public static String clickView(long customerId, String date, String gclid) {
    return ClickViewName.format(String.valueOf(customerId), concatIdentifiers(date, gclid));
  }

  /** Returns the conversion action resource name for the specified components. */
  public static String conversionAction(long customerId, long conversionActionId) {
    return ConversionActionName.format(
        String.valueOf(customerId), String.valueOf(conversionActionId));
  }

  /** Returns the custom interest for the specified components. */
  public static String customInterest(long customerId, long customInterestId) {
    return CustomInterestName.format(String.valueOf(customerId), String.valueOf(customInterestId));
  }

  /** Returns the customer resource name for the specified components. */
  public static String customer(long customerId) {
    return CustomerName.format(String.valueOf(customerId));
  }

  /** Returns the customer client resource name for the specified components. */
  public static String customerClient(long customerId, long clientCustomerId) {
    return CustomerClientName.format(String.valueOf(customerId), String.valueOf(clientCustomerId));
  }

  /** Returns the customer client link resource name for the specified components. */
  public static String customerClientLink(
      long customerId, long clientCustomerId, long managerLinkId) {
    return CustomerClientLinkName.format(
        String.valueOf(customerId), concatIdentifiers(clientCustomerId, managerLinkId));
  }

  /** Returns the customer extension setting for the specified components. */
  public static String customerExtensionSetting(long customerId, ExtensionType extensionType) {
    return CustomerExtensionSettingName.format(String.valueOf(customerId), extensionType.name());
  }

  /** Returns the customer feed resource name for the specified components. */
  public static String customerFeed(long customerId, long feedId) {
    return CustomerFeedName.format(String.valueOf(customerId), String.valueOf(feedId));
  }

  /** Returns the customer label for the specified components. */
  public static String customerLabel(long customerId, long labelId) {
    return CustomerLabelName.format(String.valueOf(customerId), String.valueOf(labelId));
  }

  /** Returns the customer manager link resource name for the specified components. */
  public static String customerManagerLink(
      long customerId, long managerCustomerId, long managerLinkId) {
    return CustomerManagerLinkName.format(
        String.valueOf(customerId), concatIdentifiers(managerCustomerId, managerLinkId));
  }

  /** Returns the customer negative criterion for the specified components. */
  public static String customerNegativeCriteria(long customerId, long criterionId) {
    return CustomerNegativeCriteriaName.format(
        String.valueOf(customerId), String.valueOf(criterionId));
  }

  /** Returns the detail placement view for the specified components. */
  public static String detailPlacementView(
      long customerId, long adGroupId, String placementBase64) {
    return DetailPlacementViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, placementBase64));
  }

  /** Returns the display keyword view resource name for the specified components. */
  public static String displayKeywordView(long customerId, long adGroupId, long criterionId) {
    return DisplayKeywordViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the domain category for the specified components. */
  public static String domainCategory(
      long customerId, long campaignId, String categoryBase64, String languageCode) {
    return DomainCategoryName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, categoryBase64, languageCode));
  }

  /** Returns the dynamic search ads search term view for the specified components. */
  public static String dynamicSearchAdsSearchTermView(
      long customerId, long adGroupId, String searchTerm, String headline, String landingPage) {
    return DynamicSearchAdsSearchTermViewName.format(
        String.valueOf(customerId),
        concatIdentifiers(adGroupId, searchTerm, headline, landingPage));
  }

  /** Returns the Expanded Landing Page View resource name for the specified components. */
  public static String expandedLandingPageView(
      long customerId, String expandedFinalUrlFingerprint) {
    return ExpandedLandingPageViewName.format(
        String.valueOf(customerId), expandedFinalUrlFingerprint);
  }

  /** Returns the extension feed item for the specified components. */
  public static String extensionFeedItem(long customerId, long feedItemId) {
    return ExtensionFeedItemName.format(String.valueOf(customerId), String.valueOf(feedItemId));
  }

  /** Returns the feed resource name for the specified components. */
  public static String feed(long customerId, long feedId) {
    return FeedName.format(String.valueOf(customerId), String.valueOf(feedId));
  }

  /** Returns the feed item resource name for the specified components. */
  public static String feedItem(long customerId, long feedId, long feedItemId) {
    return FeedItemName.format(String.valueOf(customerId), concatIdentifiers(feedId, feedItemId));
  }

  /** Returns the feed item target for the specified components. */
  public static String feedItemTarget(
      long customerId,
      long feedId,
      long feedItemId,
      FeedItemTargetType targetType,
      long feedItemTargetId) {
    return FeedItemTargetName.format(
        String.valueOf(customerId),
        concatIdentifiers(feedId, feedItemId, targetType.name(), feedItemTargetId));
  }

  /** Returns the feed mapping resource name for the specified components. */
  public static String feedMapping(long customerId, long feedId, long feedMappingId) {
    return FeedMappingName.format(
        String.valueOf(customerId), concatIdentifiers(feedId, feedMappingId));
  }

  /** Returns the feed placeholder view for the specified components. */
  public static String feedPlaceholderView(long customerId, PlaceholderType placeholderType) {
    return FeedPlaceholderViewName.format(String.valueOf(customerId), placeholderType.name());
  }

  /** Returns the gender view resource name for the specified components. */
  public static String genderView(long customerId, long adGroupId, long criterionId) {
    return GenderViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the geo target constant resource name for the specified components. */
  public static String geoTargetConstant(long criterionId) {
    return GeoTargetConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the geographic view for the specified components. */
  public static String geographicView(
      long customerId, long countryCriterionId, GeoTargetingType targetType) {
    return GeographicViewName.format(
        String.valueOf(customerId), concatIdentifiers(countryCriterionId, targetType.name()));
  }

  /** Returns the google ads field resource name for the specified components. */
  public static String googleAdsField(String field) {
    return GoogleAdsFieldName.format(field);
  }

  /** Returns the group placement view for the specified components. */
  public static String groupPlacementView(long customerId, long adGroupId, String placementBase64) {
    return GroupPlacementViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, placementBase64));
  }

  /** Returns the hotel group view resource name for the specified components. */
  public static String hotelGroupView(long customerId, long adGroupId, long criterionId) {
    return HotelGroupViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the hotel performance view resource name for the specified components. */
  public static String hotelPerformanceView(long customerId) {
    return HotelPerformanceViewName.format(String.valueOf(customerId));
  }

  /** Returns the keyword plan resource name for the specified components. */
  public static String keywordPlan(long customerId, long kpPlanId) {
    return KeywordPlanName.format(String.valueOf(customerId), String.valueOf(kpPlanId));
  }

  /** Returns the keyword plan ad group resource name for the specified components. */
  public static String keywordPlanAdGroup(long customerId, long kpAdGroupId) {
    return KeywordPlanAdGroupName.format(String.valueOf(customerId), String.valueOf(kpAdGroupId));
  }

  /** Returns the keyword plan campaign resource name for the specified components. */
  public static String keywordPlanCampaign(long customerId, long kpCampaignId) {
    return KeywordPlanCampaignName.format(String.valueOf(customerId), String.valueOf(kpCampaignId));
  }

  /** Returns the keyword plan keyword resource name for the specified components. */
  public static String keywordPlanKeyword(long customerId, long kpAdGroupKeywordId) {
    return KeywordPlanKeywordName.format(
        String.valueOf(customerId), String.valueOf(kpAdGroupKeywordId));
  }

  /** Returns the keyword plan negative keyword resource name for the specified components. */
  public static String keywordPlanNegativeKeyword(long customerId, long kpCampaignKeywordId) {
    return KeywordPlanNegativeKeywordName.format(
        String.valueOf(customerId), String.valueOf(kpCampaignKeywordId));
  }

  /** Returns the keyword view resource name for the specified components. */
  public static String keywordView(long customerId, long adGroupId, long criterionId) {
    return KeywordViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the label for the specified components. */
  public static String label(long customerId, long labelId) {
    return LabelName.format(String.valueOf(customerId), String.valueOf(labelId));
  }

  /** Returns the Landing Page View resource name for the specified components. */
  public static String landingPageView(long customerId, String unexpandedFinalUrlFingerprint) {
    return LandingPageViewName.format(String.valueOf(customerId), unexpandedFinalUrlFingerprint);
  }

  /** Returns the language constant resource name for the specified components. */
  public static String languageConstant(long criterionId) {
    return LanguageConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the location view for the specified components. */
  public static String locationView(long customerId, long campaignId, long criterionId) {
    return LocationViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the managed placement view resource name for the specified components. */
  public static String managedPlacementView(long customerId, long adGroupId, long criterionId) {
    return ManagedPlacementViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the media file resource name for the specified components. */
  public static String mediaFile(long customerId, long mediaId) {
    return MediaFileName.format(String.valueOf(customerId), String.valueOf(mediaId));
  }

  /** Returns the merchant center link for the specified components. */
  public static String merchantCenterLink(long customerId, long merchantCenterId) {
    return MerchantCenterLinkName.format(
        String.valueOf(customerId), String.valueOf(merchantCenterId));
  }

  /** Returns the mobile app category constant resource name for the specified components. */
  public static String mobileAppCategoryConstant(long mobileAppCategoryId) {
    return MobileAppCategoryConstantName.format(String.valueOf(mobileAppCategoryId));
  }

  /** Returns the mobile device constant resource name for the specified components. */
  public static String mobileDeviceConstant(long criterionId) {
    return MobileDeviceConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the mutate job for the specified components. */
  public static String mutateJob(long customerId, long mutateJobId) {
    return MutateJobName.format(String.valueOf(customerId), String.valueOf(mutateJobId));
  }

  /** Returns the operation system version constant resource name for the specified components. */
  public static String operatingSystemVersionConstant(long criterionId) {
    return OperatingSystemVersionConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the Paid Organic Search Term View resource name for the specified components. */
  public static String paidOrganicSearchTermView(
      long customerId, long campaignId, long adGroupid, String searchTermBase64) {
    return PaidOrganicSearchTermViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, adGroupid, searchTermBase64));
  }

  /** Returns the parental status view resource name for the specified components. */
  public static String parentalStatusView(long customerId, long adGroupId, long criterionId) {
    return ParentalStatusViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the payments account resource name for the specified components. */
  public static String paymentsAccount(
      long customerId, long paymentsProfileId, long paymentsAccountId) {
    return String.format(
        "customers/%s/paymentsAccounts/%s",
        String.valueOf(customerId), concatIdentifiers(paymentsProfileId, paymentsAccountId));
  }

  /** Returns the product bidding category constant for the specified components. */
  public static String productBiddingCategoryConstant(
      String countryCode, ProductBiddingCategoryLevel level, long constantId) {
    return ProductBiddingCategoryConstantName.format(concatIdentifiers(countryCode, level.name(), constantId));
  }

  /** Returns the product group view resource name for the specified components. */
  public static String productGroupView(long customerId, long adgroupId, long criterionId) {
    return ProductGroupViewName.format(
        String.valueOf(customerId), concatIdentifiers(adgroupId, criterionId));
  }

  /** Returns the recommendation resource name for the specified components. */
  public static String recommendation(long customerId, String recommendationId) {
    return RecommendationName.format(String.valueOf(customerId), recommendationId);
  }

  /** Returns the remarketing action resource name for the specified components. */
  public static String remarketingAction(long customerId, long remarketingActionId) {
    return RemarketingActionName.format(
        String.valueOf(customerId), String.valueOf(remarketingActionId));
  }

  /** Returns the search term view resource name for the specified components. */
  public static String searchTermView(
      long customerId, long campaignId, long adGroupId, String query) {
    return SearchTermViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, adGroupId, query));
  }

  /** Returns the shared criterion resource name for the specified components. */
  public static String sharedCriterion(long customerId, long sharedSetId, long criterionId) {
    return SharedCriteriaName.format(
        String.valueOf(customerId), concatIdentifiers(sharedSetId, criterionId));
  }

  /** Returns the shared set resource name for the specified components. */
  public static String sharedSet(long customerId, long sharedSetId) {
    return SharedSetName.format(String.valueOf(customerId), String.valueOf(sharedSetId));
  }

  /** Returns the Shopping Performance View resource name for the specified components. */
  public static String shoppingPerformanceView(long customerId) {
    return ShoppingPerformanceViewName.format(String.valueOf(customerId));
  }

  /** Returns the topic constant resource name for the specified components. */
  public static String topicConstant(long verticalId) {
    return TopicConstantName.format(String.valueOf(verticalId));
  }

  /** Returns the topic view resource name for the specified components. */
  public static String topicView(long customerId, long adGroupId, long criterionId) {
    return TopicViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the user interest resource name for the specified components. */
  public static String userInterest(long customerId, long categoryId) {
    return UserInterestName.format(String.valueOf(customerId), String.valueOf(categoryId));
  }

  /** Returns the user list resource name for the specified components. */
  public static String userList(long customerId, long userListId) {
    return UserListName.format(String.valueOf(customerId), String.valueOf(userListId));
  }

  /** Returns the video resource name for the specified components. */
  public static String video(long customerId, String videoId) {
    return VideoName.format(String.valueOf(customerId), videoId);
  }

  /**
   * Returns a string consisting of the specified identifiers, concatenated together using the
   * standard delimiter for composite identifiers.
   */
  private static String concatIdentifiers(Object... toConcat) {
    String pattern = Stream.of(toConcat).map(arg -> "%s").collect(Collectors.joining("~"));
    return String.format(pattern, toConcat);
  }
}
