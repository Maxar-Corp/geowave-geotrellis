package mil.nga.giat.geowave.geotrellis;

import geotrellis.macros.DoubleTileCombiner3;
import geotrellis.macros.DoubleTileCombiner4;
import geotrellis.macros.IntTileCombiner3;
import geotrellis.macros.IntTileCombiner4;
import geotrellis.raster.CellType;
import geotrellis.raster.MultiBandTile;
import geotrellis.raster.Tile;

import org.geotools.coverage.grid.GridCoverage2D;

import scala.Function1;
import scala.Function2;
import scala.Tuple2;
import scala.runtime.BoxedUnit;

public class GridCoverageTileWrapper implements
		MultiBandTile
{
	private GridCoverage2D gridCoverage;

	public GridCoverageTileWrapper(
			GridCoverage2D gridCoverage ) {
		this.gridCoverage = gridCoverage;
	}

	@Override
	public Tile combineDoubleTileCombiner(
			final DoubleTileCombiner3 arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile combineDoubleTileCombiner(
			final DoubleTileCombiner4 arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile combineIntTileCombiner(
			final IntTileCombiner3 arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile combineIntTileCombiner(
			final IntTileCombiner4 arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile band(
			final int arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bandCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CellType cellType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cols() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Tile combine(
			final Function1<int[], Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile combine(
			final int arg0,
			final int arg1,
			final Function2<Object, Object, Object> arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile combineDouble(
			final Function1<double[], Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tile combineDouble(
			final int arg0,
			final int arg1,
			final Function2<Object, Object, Object> arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultiBandTile convert(
			final CellType arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple2<Object, Object> dimensions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void foreach(
			final Function2<Object, Object, BoxedUnit> arg0 ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void foreach(
			final int arg0,
			final Function1<Object, BoxedUnit> arg1 ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void foreachDouble(
			final Function2<Object, Object, BoxedUnit> arg0 ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void foreachDouble(
			final int arg0,
			final Function1<Object, BoxedUnit> arg1 ) {
		// TODO Auto-generated method stub

	}

	@Override
	public MultiBandTile map(
			final Function2<Object, Object, Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultiBandTile map(
			final int arg0,
			final Function1<Object, Object> arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultiBandTile mapDouble(
			final Function2<Object, Object, Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultiBandTile mapDouble(
			final int arg0,
			final Function1<Object, Object> arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
