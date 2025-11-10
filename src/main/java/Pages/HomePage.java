package Pages;

import BasePage.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By campaignsLocator = By.className("fa-university");
    private final By showAllCampaign = By.cssSelector("a[href*='listCampaign.xhtml']");
    private final By createCampaign = By.cssSelector("a[href*='createCampaign.xhtml']");
    private final By listCampaign = By.cssSelector("a[href='listCampaignType.xhtml']");
    private final By campaignType = By.cssSelector("a[href='createCampaignType.xhtml']");

    // Create Campaign button
    private final By CreateCampaignButton = By.cssSelector("a[href=\"/CRMweb/faces/createCampaign.xhtml\"]");

    public void clickCampaigns() {
        click(campaignsLocator);
    }

    public void clickShowAllCampaign() {
        click(showAllCampaign);
    }

    public void clickCreateCampaign() {
        click(createCampaign);
    }

    public void clickShowAllCampaignType() {
        click(listCampaign);
    }

    public void clickCreateCampaignType() {
        click(campaignType);
    }

    public void clickCreateNewCampaignButton() {
        click(CreateCampaignButton);
    }
}
