package Pages;

import BasePage.BasePage;
import models.Campaign;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowAllCampaignPage extends BasePage {

    private final By createButton = By.cssSelector("input[type='submit']");


    // Error Message
    private final By getCampaignNameError = By.xpath("//input[@id='j_idt70:cn']/preceding-sibling::span");
    private final By getStartDateError = By.xpath("//input[@id='j_idt70:sd']/preceding-sibling::span");
    private final By getEndDateError = By.xpath("//input[@id='j_idt70:ed']/preceding-sibling::span");
    private final By getExpectedRevenueError = By.xpath("//input[@id='j_idt70:er']/preceding-sibling::span");
    private final By getBudgetedCostError = By.xpath("//input[@id='j_idt70:bc']/preceding-sibling::span");
    private final By getActualCostError = By.xpath("//input[@id='j_idt70:ac']/preceding-sibling::span");
    private final By getDesError = By.xpath("//textarea[@id='j_idt70:de']/preceding-sibling::span");

    private final By filterCampaignName = By.id("j_idt72:j_idt73:j_idt74:filter");
    private final By listCampaign = By.id("j_idt72:j_idt73_data");

    private final By NewCampaignButton = By.cssSelector("a[href=\"/CRMweb/faces/createCampaign.xhtml\"]");

    public void clickNewCampaign() {
        click(NewCampaignButton);
    }



    public void filterCampaignName(Campaign campaign) {
        type(filterCampaignName,campaign.getCampaignName());
    }

    public List<String> getListCampaign() {
        return getTextInList(listCampaign);
    }



    public List<String> getListCampaignData(Campaign campaign) {
        List<String> data = new ArrayList<>();
        data.add(campaign.getCampaignName());
        data.add(campaign.getType());
        data.add(String.valueOf(campaign.getStartDate()));
        data.add(String.valueOf(campaign.getEndDate()));
        return data;
    }



    public List<String> getErrorMessages() {
        return Arrays.asList(
                getText(getCampaignNameError),
                getText(getStartDateError),
                getText(getEndDateError),
                getText(getExpectedRevenueError),
                getText(getBudgetedCostError),
                getText(getActualCostError),
                getText(getDesError)
        );
    }


    private By editLocator(Integer id) {
        return By.cssSelector(String.format("a[href='/CRMweb/faces/editCampaign.xhtml?id=%d']", id));
    }

    public void clickEditCampaign(Integer id) {
        By getId = editLocator(id);
        click(getId);
    }

    public void clickCreateButton() {
        click(createButton);
    }




}
