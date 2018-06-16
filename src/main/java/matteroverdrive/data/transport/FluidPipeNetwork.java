/*
 * This file is part of Matter Overdrive
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */
package matteroverdrive.data.transport;

import matteroverdrive.api.transport.IGridNetwork;
import matteroverdrive.handler.matter_network.FluidNetworkHandler;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Simeon on 12/28/2015.
 */
public class FluidPipeNetwork extends AbstractGridNetwork<IFluidPipe> {
    private Fluid fluidType;
    private int fluidReqiest;

    public FluidPipeNetwork(FluidNetworkHandler networkHandler) {
        super(networkHandler, IFluidPipe.class);
    }

    @Override
    public boolean canMerge(IGridNetwork network) {
        return true;
    }

    @Override
    protected void onNodeAdded(IFluidPipe node) {

    }

    @Override
    protected void onNodeRemoved(IFluidPipe node) {

    }
}
