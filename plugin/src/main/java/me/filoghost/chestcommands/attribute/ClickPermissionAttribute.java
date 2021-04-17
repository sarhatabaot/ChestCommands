/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.chestcommands.attribute;

import me.filoghost.chestcommands.icon.InternalConfigurableIcon;

import java.util.Collections;
import java.util.List;

public class ClickPermissionAttribute implements IconAttribute {

    private final List<String> clickPermission;

    public ClickPermissionAttribute(String clickPermission, AttributeErrorHandler errorHandler) {
        this.clickPermission = Collections.singletonList(clickPermission);
    }

    public ClickPermissionAttribute(List<String> clickPermissions, AttributeErrorHandler errorHandler) {
        this.clickPermission = clickPermissions;
    }
    
    @Override
    public void apply(InternalConfigurableIcon icon) {
        icon.setClickPermission(clickPermission);
    }

}
