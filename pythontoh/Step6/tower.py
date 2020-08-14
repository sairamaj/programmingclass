from disk import Disk


class Tower:

    # Constructor. which will be called during construction
    # which is Tower("some title")
    def __init__(self, title):  
        self.disk_bag = []
        self.title = title      # automatially adding a property to object

    def add_disk(self, disk):
        self.disk_bag.append(disk)

    def remove_disk(self):
        topDisk = self.disk_bag[0]
        self.disk_bag.remove(topDisk)
        return topDisk

    def drawPole(self):
        for x in range(1, 5, 1):
            print('                       |')

    def drawBase(self):
        print('           ---------------------')

    def drawTitle(self):
        print(f"                    {self.title}")

    def draw(self):
        # pole
        self.drawPole()

        # drawing disks
        for disk in self.disk_bag:
            disk.draw()

        # now base
        self.drawBase()

        # title now.
        self.drawTitle()
