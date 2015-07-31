package mil.nga.giat.geowave.geotrellis;

import org.geotools.coverage.grid.GridCoverage2D;

import scala.Function1;
import scala.Function2;
import scala.Tuple2;
import scala.runtime.BoxedUnit;
import geotrellis.macros.DoubleTileMapper;
import geotrellis.macros.DoubleTileVisitor;
import geotrellis.macros.IntTileMapper;
import geotrellis.macros.IntTileVisitor;
import geotrellis.raster.ArrayTile;
import geotrellis.raster.CellSet;
import geotrellis.raster.CellType;
import geotrellis.raster.GridBounds;
import geotrellis.raster.MutableArrayTile;
import geotrellis.raster.RasterExtent;
import geotrellis.raster.Tile;
import geotrellis.raster.interpolation.InterpolationMethod;
import geotrellis.vector.Extent;

public class GridCoverageSingleBandTileWrapper implements Tile
{
	private GridCoverage2D gridCoverage;
	private int b;
	public GridCoverageSingleBandTileWrapper(
			GridCoverage2D gridCoverage,
			int b ) {
		this.gridCoverage = gridCoverage;
		this.b = b;
	}
	
	@Override
	public void foreachDoubleVisitor(
			DoubleTileVisitor arg0 ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void foreachIntVisitor(
			IntTileVisitor arg0 ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Tile mapDoubleMapper(
			DoubleTileMapper arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile mapIntMapper(
			IntTileMapper arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String asciiDraw() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String asciiDrawDouble(
			int arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int asciiDrawDouble$default$1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String asciiDrawRange(
			int arg0,
			int arg1,
			int arg2,
			int arg3 ) {
		// TODO Auto-generated method stub
		return null;
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
			Tile arg0,
			Function2<Object, Object, Object> arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile combineDouble(
			Tile arg0,
			Function2<Object, Object, Object> arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile convert(
			CellType arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile crop(
			GridBounds arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile crop(
			int arg0,
			int arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile crop(
			Extent arg0,
			Extent arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile crop(
			int arg0,
			int arg1,
			int arg2,
			int arg3 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tuple2<Object, Object> dimensions() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile downsample(
			int arg0,
			int arg1,
			Function1<CellSet, Object> arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile dualCombine(
			Tile arg0,
			Function2<Object, Object, Object> arg1,
			Function2<Object, Object, Object> arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void dualForeach(
			Function1<Object, BoxedUnit> arg0,
			Function1<Object, BoxedUnit> arg1 ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Tile dualMap(
			Function1<Object, Object> arg0,
			Function1<Object, Object> arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile dualMapIfSet(
			Function1<Object, Object> arg0,
			Function1<Object, Object> arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tuple2<Object, Object> findMinMax() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tuple2<Object, Object> findMinMaxDouble() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void foreach(
			Function1<Object, BoxedUnit> arg0 ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void foreachDouble(
			Function1<Object, BoxedUnit> arg0 ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void geotrellis$raster$Tile$_setter_$gridBounds_$eq(
			GridBounds arg0 ) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int get(
			int arg0,
			int arg1 ) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getDouble(
			int arg0,
			int arg1 ) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public GridBounds gridBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile map(
			Function1<Object, Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile mapDouble(
			Function1<Object, Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile mapIfSet(
			Function1<Object, Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile mapIfSetDouble(
			Function1<Object, Object> arg0 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MutableArrayTile mutable() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile normalize(
			int arg0,
			int arg1,
			int arg2,
			int arg3 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile normalize(
			double arg0,
			double arg1,
			double arg2,
			double arg3 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			Extent arg0,
			RasterExtent arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			Extent arg0,
			Extent arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			int arg0,
			int arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			Extent arg0,
			RasterExtent arg1,
			InterpolationMethod arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			Extent arg0,
			Extent arg1,
			InterpolationMethod arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			Extent arg0,
			int arg1,
			int arg2 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile resample(
			Extent arg0,
			int arg1,
			int arg2,
			InterpolationMethod arg3 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile rescale(
			int arg0,
			int arg1 ) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tile rescale(
			double arg0,
			double arg1 ) {
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
	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double[] toArrayDouble() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayTile toArrayTile() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public byte[] toBytes() {
		// TODO Auto-generated method stub
		return null;
	}
}
