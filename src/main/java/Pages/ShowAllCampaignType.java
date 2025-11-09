package Pages;

import BasePage.BasePage;
import Utils.FakerData;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import models.Campaign;
import net.bytebuddy.implementation.ToStringMethod;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class ShowAllCampaignType extends BasePage {

    private final By newCampaignType = By.cssSelector("a[href=\"/CRMweb/faces/createCampaignType.xhtml\"]");
    private final By campaignTypeNameFilter = By.id("formcampaigntype:j_idt72:j_idt73:filter");
    private final By listCampaignType = By.id("formcampaigntype:j_idt72_data");
    private final By firstColumnCells = By.xpath("//tbody[@id='formcampaigntype:j_idt72_data']//tr/td[1]");


    public void filterCampaignTypeName(Campaign campaign) {
        type(campaignTypeNameFilter, campaign.getCampaignTypeName());
    }

    public String getCampaignTypeNameText(Campaign campaign) {
        waitForTextToBePresent(firstColumnCells, campaign.getCampaignTypeName());
        return getText(firstColumnCells);
    }


    public String getListCampaignTypeData(Campaign campaign) {
        return campaign.getCampaignTypeName();
    }


    public void clickNewCampaignType() {
        click(newCampaignType);
    }


    private final By IdEditLocator = By.xpath("//tbody[@id='formcampaigntype:j_idt72_data']//tr/td[2]/a");


    public void editCampaignType() {
        click(IdEditLocator);
    }


    private final By deleteLocator = By.cssSelector("input[type='submit']");

    public void delete() {
        click(deleteLocator);
    }

    public void getListCampaignFilter() {

    }

}
