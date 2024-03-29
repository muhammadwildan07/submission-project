package com.finalproject.assetmanagement.model.request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AssetRequest {

    private String assetCode;

    private String name;

    private String description;

    private String branchId;

}
