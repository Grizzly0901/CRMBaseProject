package models;
import lombok.Data;


import java.time.LocalDate;


@Data
public class Campaign {

    private String campaignTypeName;
    private String campaignName;
    private String type;
    private String status;
    private LocalDate startDate;
    private LocalDate endDate;
    private String expectedRevenue;
    private String budgetedCost;
    private String actualCost;
    private String description;

}

