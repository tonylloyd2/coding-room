from django.db import migrations
from api.user.models import CustomUser


class Migration(migrations.Migration):
    def seed_data(apps, schema_editor):
        user = CustomUser(name="",
                          email="hitesh@lco.dev",
                          is_staff=True,
                          is_superuser=True,
                          phone="987654321",
                          gender="Male"
                          )
        user.set_password("12345")
        user.save()
        user2 = CustomUser(name="lloyd",
                          email="lloyd@254.dev",
                          is_staff=True,
                          is_superuser=True,
                          phone="042441412",
                          gender="Male"
                          )
        user2.set_password("1234")
        user2.save()
    dependencies = [

    ]

    operations = [
        migrations.RunPython(seed_data),
    ]
