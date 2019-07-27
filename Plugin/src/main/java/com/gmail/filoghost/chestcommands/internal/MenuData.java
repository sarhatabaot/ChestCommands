/*
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package com.gmail.filoghost.chestcommands.internal;

import com.gmail.filoghost.chestcommands.internal.icon.IconCommand;
import com.gmail.filoghost.chestcommands.util.ClickType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;

import java.util.List;

@Getter
@Setter
public class MenuData {
	// Required data
	@Setter (AccessLevel.NONE)
	private String title;
	@Setter (AccessLevel.NONE)
	private int rows;

	// Optional data
	private String[] commands;
	private Material boundMaterial;
	private short boundDataValue;
	private ClickType clickType;
	private List<IconCommand> openActions;
	private int refreshTenths;

	public MenuData(String title, int rows) {
		this.title = title;
		this.rows = rows;
		boundDataValue = -1; // -1 = any
	}

	public boolean hasCommands() {
		return commands != null && commands.length > 0;
	}

	public boolean hasBoundMaterial() {
		return boundMaterial != null;
	}

	public boolean hasBoundDataValue() {
		return boundDataValue > -1;
	}
}
