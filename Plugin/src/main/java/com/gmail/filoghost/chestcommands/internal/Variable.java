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

import com.gmail.filoghost.chestcommands.bridge.EconomyBridge;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public enum Variable {

	PLAYER("{player}") {
		public String getReplacement(Player executor) {
			return executor.getName();
		}
	},

	ONLINE("{online}") {
		public String getReplacement(Player executor) {
			return String.valueOf(CachedGetters.getOnlinePlayers());
		}
	},

	MAX_PLAYERS("{max_players}") {
		public String getReplacement(Player executor) {
			return String.valueOf(Bukkit.getMaxPlayers());
		}
	},

	MONEY("{money}") {
		public String getReplacement(Player executor) {
			if (EconomyBridge.hasValidEconomy()) {
				return EconomyBridge.formatMoney(EconomyBridge.getMoney(executor));
			} else {
				return "[ECONOMY PLUGIN NOT FOUND]";
			}
		}
	},

	WORLD("{world}") {
		public String getReplacement(Player executor) {
			return executor.getWorld().getName();
		}
	};

	private String text;

	Variable(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public abstract String getReplacement(Player executor);
}
